package com.wangyao.common.exception;

public class BizException extends Exception {
    private static final long serialVersionUID = -504955880063536901L;
    private ErrorCode errorCode;

    public BizException() {
    }

    public ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public BizException(ErrorCode code) {
        super(code.getMessage());
        this.errorCode = code;
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public BizException(Throwable cause, ErrorCode code) {
        super(code.getMessage(), cause);
        this.errorCode = code;
    }

    public Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
