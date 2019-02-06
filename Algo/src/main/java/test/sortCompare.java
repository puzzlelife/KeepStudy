package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class sortCompare {
    public static void main(String[] args) {
        List<Item> list=new ArrayList<Item>();
        list.add(new Item(1,"bbb"));
        list.add(new Item(2,"aaa"));

        list.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if(o1.getId()>o2.getId()){
                    return 1;
                }
                if(o1.getId()<o2.getId()){
                    return -1;
                }
                return 0;
            }
        });


        for (Item item : list) {
            System.out.println(item.getId()+" "+item.getName());
        }
    }
}
