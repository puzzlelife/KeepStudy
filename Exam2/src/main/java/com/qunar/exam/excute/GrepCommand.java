package com.qunar.exam.excute;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyao on 17-7-31.
 */
public class GrepCommand implements ICommand {
    public List<String> excute(String paramer, List<String> fileContent) {

        List<String> file = new ArrayList<String>();
        for (String s : fileContent) {
            if (s.contains(paramer)) {
                file.add(s);
            }
        }
        return file;
    }
}
