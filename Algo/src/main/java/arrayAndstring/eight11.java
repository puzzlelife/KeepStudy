package arrayAndstring;

import utils.ConsoleInOut;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class eight11 {
    /**
     *
     * 实现一个算法，确定一个字符串的所有字符是否全部不同
     * 假使不允许使用额外数据结构，又该如何处理
     */

    public static void main(String[] args) {
        //先确认是ascii编码还是unicode编码，ascii共256个，unicode共1114112个，本题用ascii
        String str= ConsoleInOut.getLine();
        if(str.length()>256){
            System.out.println("yes");
        }
        judgeWithStucture(str);
        judgeWithNoStucture(str);
    }

    private static void judgeWithStucture(String str){
        Map<Character,Integer> charNumber=new HashMap<Character, Integer>();

        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (charNumber.containsKey(c)){
                System.out.println("judgeWithStucture: The string has the same char");
                return;
            }else {
                charNumber.put(c,1);
            }
        }

        System.out.println("judgeWithStucture:No same chatacter");
    }

    private static void judgeWithNoStucture(String str){
        boolean[] char_set=new boolean[256];
        for(int i=0;i<str.length();i++){
            int num=str.charAt(i);
            if(char_set[num]){
                System.out.println("judgeWithNoStucture: The string has the same char");
                return;
            }
            char_set[num]=true;
        }

        System.out.println("judgeWithNoStucture:No same chatacter");
    }
}
