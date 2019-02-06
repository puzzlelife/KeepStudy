package utils;

import com.google.common.collect.Lists;
import com.google.common.io.Files;
import sort.simpleSort;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class FileInOut {

    public static List<String> getFileContent(String path){
        List<String> fileContent= Lists.newArrayList();
        try {
            fileContent= Files.asCharSource(new File(path), Charset.defaultCharset()).readLines();
        } catch (IOException e) {
            System.out.println("文件读入失败");
            e.printStackTrace();
        }
        return fileContent;
    }

    public static void outputFile(String path,String fileName,List<String> outputContent){
        try {
            Files.asCharSink(new File(path+fileName), Charset.defaultCharset()).writeLines(outputContent);
        } catch (IOException e) {
            System.out.println("文件输出失败");
            e.printStackTrace();
        }
    }

    public static List<String> getInputFile(String filename){
        List<String> fileContent= Lists.newArrayList();
        try {
            String path= simpleSort.class.getClassLoader().getResource(filename).getPath();
            fileContent= Files.asCharSource(new File(path), Charset.defaultCharset()).readLines();
        } catch (IOException e) {
            System.out.println("文件读入失败");
            e.printStackTrace();
        }
        return fileContent;
    }
}
