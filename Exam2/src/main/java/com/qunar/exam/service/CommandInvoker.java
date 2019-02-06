package com.qunar.exam.service;

import com.google.common.base.*;
import com.google.common.base.Optional;
import com.qunar.exam.excute.CatCommand;
import com.qunar.exam.excute.GrepCommand;
import com.qunar.exam.excute.ICommand;
import com.qunar.exam.excute.WcCommand;
import com.qunar.exam.model.CommandType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by wangyao on 17-7-31.
 * <p>
 * <p>
 * 命令的执行类
 */
public class CommandInvoker {

    private static final Logger logger = LoggerFactory.getLogger(CommandInvoker.class);

    //要执行功能的文件
    private List<String> fileContent;
    //要执行的命令
    private List<String> nextCommand;
    Map<CommandType, ICommand> map;

    public CommandInvoker(List<String> fileContent, List<String> nextCommand) {
        this.fileContent = fileContent;
        this.nextCommand = nextCommand;
        map = new HashMap<CommandType, ICommand>();
        map.put(CommandType.CAT, new CatCommand());
        map.put(CommandType.GREP, new GrepCommand());
        map.put(CommandType.WC, new WcCommand());

    }

    public void excute() {

        //迭代器迭代执行命令
        Iterator<String> iterator = nextCommand.iterator();
        while (iterator.hasNext()) {
            String command = iterator.next();
            List<String> commandDetail=Splitter.on(Pattern.compile(" +")).trimResults(CharMatcher.anyOf("\'\"").or(CharMatcher.whitespace())).splitToList(command);
            try {
                //若没有参数按空值对待
                String paramer = Optional.fromNullable(commandDetail.get(1)).or("");
                fileContent = map.get(CommandType.valueOf(commandDetail.get(0).toUpperCase())).excute(paramer, fileContent);

            } catch (Exception e) {
                logger.info("不支持的命令：{}", e.getMessage());
            }
        }

        StringBuilder result = new StringBuilder();
        for (String s : fileContent) {
            result.append(s).append("\r\n");
        }
        logger.info(result.toString());

    }

}
