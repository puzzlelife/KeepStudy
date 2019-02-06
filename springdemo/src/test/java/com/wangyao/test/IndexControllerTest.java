package com.wangyao.test;

import com.wangyao.controller.IndexController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by dell--pc on 2017/12/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class IndexControllerTest {
    @Resource
    IndexController indexController;
    @Test
    public void test(){
        System.out.println("aaa");
    }
}
