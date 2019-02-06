package com.qunar.exam.controller;

import com.qunar.exam.service.CommandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Created by wangyao on 17-7-30.
 */
public class CommandController {

    private static final Logger logger = LoggerFactory.getLogger(CommandController.class);

    CommandService commandService = new CommandService();

    public void run() {
        logger.info("请输入命令：");
        String command = new Scanner(System.in).nextLine();
        if (command.trim().length() == 0) {
            logger.info("输入为空，请重新输入");
        } else {
            //调用执行命令方法
            commandService.excuteCommand(command);
        }

    }
}
