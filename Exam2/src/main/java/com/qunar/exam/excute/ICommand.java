package com.qunar.exam.excute;

import java.util.List;

/**
 * Created by wangyao on 17-7-31.
 *
 * 参考了命令模式
 */
public interface ICommand {
    public List<String> excute(String paramer, List<String> fileContent);
}
