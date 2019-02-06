package com.wangyao.common.button.buttons;

import com.wangyao.common.button.buttonLogic;
import org.springframework.stereotype.Service;

@Service
public class firstButton implements buttonLogic {

    public void login() {
        System.out.println("1");
    }
}
