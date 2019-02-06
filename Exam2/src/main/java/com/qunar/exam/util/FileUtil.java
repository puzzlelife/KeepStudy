package com.qunar.exam.util;

import com.google.common.collect.Lists;
import com.google.common.io.Files;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by wangyao on 17-7-30.
 */
public class FileUtil {

    private static final Logger logger= LoggerFactory.getLogger(FileUtil.class);
    public static List<String> getFileContent(String path){
        List<String> fileContent= Lists.newArrayList();
        try {
            fileContent= Files.asCharSource(new File(path), Charset.defaultCharset()).readLines();
        } catch (IOException e) {
            logger.info("文件读入失败，详情：{}",e.getMessage());
        }
        return fileContent;
    }
}
