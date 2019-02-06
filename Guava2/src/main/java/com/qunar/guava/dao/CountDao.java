package com.qunar.guava.dao;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wangyao on 17-7-26.
 */
public class CountDao {
    private List<String> result;
    private Map<String,Integer> methodTimes;
    private Map<String,Integer> httpTimes;
    private Multimap<String,String> parts;
    private List<String> list;
    private List<Map.Entry<String,Integer>> sortHttp;

    public CountDao(){
        result= Lists.newArrayList();
        methodTimes=Maps.newHashMap();
        httpTimes=Maps.newHashMap();
        parts= HashMultimap.create();
    }

    public List<String> count(List<String> list){
        this.list=list;



        //对每行读取
        for (String content : list) {

            //用正则表达式匹配
            String pattern = "(GET|POST) ((/.*/)(.*))";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(content);


            if (m.find( )) {

                // m.group(1) GET|POST
                if (methodTimes.containsKey(m.group(1))){
                    methodTimes.put(m.group(1),methodTimes.get(m.group(1))+1);
                }else {
                    methodTimes.put(m.group(1),1);
                }


                //m.group(2) HTTP接口
                if (httpTimes.containsKey(m.group(2))){
                    httpTimes.put(m.group(2),httpTimes.get(m.group(2))+1);
                }else {
                    httpTimes.put(m.group(2),1);
                }



                //m.group(3) /AAA/  m.group(4) BBB/CCC
                parts.put(m.group(3),m.group(4));
            }

        }

        //对http次数排序
        sortHttp=new ArrayList<Map.Entry<String, Integer>>(httpTimes.entrySet());
        Collections.sort(sortHttp, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        //将结果转为List
        toList();
        return result;
    }

    private void toList(){
        result.add("请求总量:"+list.size());
        result.add("请求最频繁的10个接口：");
        for(int i=0;i<10;i++){
            result.add(i+1+"、"+sortHttp.get(i).getKey()+"  访问次数："+sortHttp.get(i).getValue()+"次");
        }
        result.add("GET请求量:"+methodTimes.get("GET"));
        result.add("POST请求量:"+methodTimes.get("POST"));

        result.add("URI分类：");

        for(Map.Entry<String,Collection<String>> entry: parts.asMap().entrySet()){
            result.add(entry.getKey()+" 路径下有"+entry.getValue().toString());
        }
    }
}
