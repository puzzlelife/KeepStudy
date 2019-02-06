package com.qunar.exam.service;

import com.google.common.base.Splitter;
import com.qunar.exam.util.FileUtil;

import java.util.List;


/**
 * Created by wangyao on 17-7-31.
 */
public class CommandService {
    public void excuteCommand(String command) {

        //以 | 为分隔符切分命令
        List<String> commands = Splitter.on("|").trimResults().splitToList(command);
        String[] strings = commands.get(0).split(" +");
        String fileName = strings[strings.length - 1];

        //读取文件
        List<String> fileContent = FileUtil.getFileContent(fileName);

        //生成一个执行类
        CommandInvoker commandExcuter = new CommandInvoker(fileContent, commands);
        commandExcuter.excute();
    }
}
