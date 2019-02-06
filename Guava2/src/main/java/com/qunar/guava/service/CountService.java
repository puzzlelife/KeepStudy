package com.qunar.guava.service;

import com.qunar.guava.dao.CountDao;

import java.util.List;

/**
 * Created by wangyao on 17-7-26.
 */
public class CountService {

    public CountService(){

    }

    CountDao countDao=new CountDao();
    public List<String> count(List<String> list){
        return countDao.count(list);
    }
}
