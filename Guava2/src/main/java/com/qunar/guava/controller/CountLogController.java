package com.qunar.guava.controller;

import com.qunar.guava.GuavaCount;
import com.qunar.guava.service.CountService;
import com.qunar.guava.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by wangyao on 17-7-26.
 */
public class CountLogController {
    private static final Logger logger= LoggerFactory.getLogger(CountLogController.class);

    CountService countService=new CountService();

    public void work(){
        logger.info("正在计算...");
        List<String> fileContent= FileUtil.getFileContent();
        List<String> results=countService.count(fileContent);
        FileUtil.outputFile(results);
        logger.info("计算完成，输出文件路径为：{}",GuavaCount.class.getClassLoader().getResource(".").getPath()+"result");
    }
}
