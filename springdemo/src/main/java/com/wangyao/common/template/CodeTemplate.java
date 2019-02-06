package com.wangyao.common.template;

import com.wangyao.common.exception.BizException;
import com.wangyao.common.exception.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CodeTemplate<T> {

    private Logger logger=LoggerFactory.getLogger(getClass());
    protected String monitorKey;

    protected void checkParams(){
    }

    protected abstract T process() throws Exception;

    protected CodeTemplate(String monitorKey) {
        this.monitorKey = monitorKey;
    }

    protected void afterProcess(){

    }

    protected void onSuccess() {
    }

    protected void onError(Throwable e) {
    }

    public T execute() throws Exception{
        try{
            checkParams();
        }catch (IllegalArgumentException e){
            logger.info("check param failed",e);
            throw new BizException(new ErrorCode(new Integer(-1), e.getMessage()));
        }

        long start = System.currentTimeMillis();
        try {
            T result = process();
            onSuccess();
            return result;
        } catch (BizException biz) {
            logger.error("biz error while execute, key: {}", monitorKey, biz);
            onError(biz);
            throw biz;
        } catch (Throwable e) {
            logger.warn("unexpected error while execute, key: {}", monitorKey, e);
            onError(e);
            throw new BizException(new ErrorCode(new Integer(-1), e.getMessage()));
        } finally {
            afterProcess();
        }
    }

}
