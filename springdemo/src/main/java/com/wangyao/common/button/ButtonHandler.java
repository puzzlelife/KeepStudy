package com.wangyao.common.button;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ButtonHandler {
    @Resource
    private List<buttonLogic> buttonList;

    public void showButtons(){
        for (buttonLogic button:buttonList){
            button.login();
        }
    }
}
