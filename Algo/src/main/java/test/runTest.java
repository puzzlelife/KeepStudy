package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class runTest {
    public static void main(String[] args) {
        //test1();
        test2();
    }
    public static void test1(){
        System.out.println(Season.SPRING.getSeason());
    }
    public static void test2(){
        List<Item> list=new ArrayList<Item>();
        list.add(new Item(1,"bbb"));
        list.add(new Item(2,"aaa"));
        System.out.println(list.stream().map(Item::getName).collect(Collectors.toList()));
    }
}
