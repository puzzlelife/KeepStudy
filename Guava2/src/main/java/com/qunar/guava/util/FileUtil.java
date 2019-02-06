package com.qunar.guava.util;

import com.google.common.collect.Lists;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import com.qunar.guava.GuavaCount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by wangyao on 17-7-26.
 */
public class FileUtil {
    private static final Logger logger= LoggerFactory.getLogger(FileUtil.class);

    public static List<String> getFileContent(){
        List<String> fileContent= Lists.newArrayList();
        String path=GuavaCount.class.getClassLoader().getResource("access.log").getPath();
        try {
            fileContent= Files.asCharSource(new File(path), Charset.defaultCharset()).readLines();
        } catch (IOException e) {
            logger.info("文件读入失败，详情：{}",e.getMessage());
        }
        return fileContent;
    }

    public static void outputFile(List<String> outputContent){
        String pathout=GuavaCount.class.getClassLoader().getResource(".").getPath();
        try {
            Files.asCharSink(new File(pathout+"result"), Charset.defaultCharset()).writeLines(outputContent);
        } catch (IOException e) {
            logger.info("文件输出失败，详情：{}",e.getCause());
        }
    }
}
