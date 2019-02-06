package com.qunar.exam.excute;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyao on 17-7-31.
 */
public class WcCommand implements ICommand {
    public List<String> excute(String paramer, List<String> fileContent) {

        List<String> file = new ArrayList<String>();
        if (paramer.equals("-l")) {
            int size = fileContent.size();
            file.add(String.valueOf(size));
        }
        return file;
    }
}
