package com.wangyao.common.button.buttons;

import com.wangyao.common.button.buttonLogic;
import org.springframework.stereotype.Service;

@Service
public class secondButton implements buttonLogic {

    public void login() {
        System.out.println("2");
    }
}
