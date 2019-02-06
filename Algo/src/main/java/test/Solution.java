package test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String maxString="";
        for (int index=0;index<s.length();index++){
            String huiString=huiString(s,index);
            if(huiString.length()>max){

                maxString=huiString;
                max=huiString.length();
            }
        }
        return maxString;
    }
    private String huiString(String s,int index){
        String temp="";
        int left=index,right=index;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            if(right-left+1>temp.length()){
                temp=s.substring(left,right);
            }
            left--;
            right++;

        }

        left=index;right=index+1;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            if(right-left+1>temp.length()){
                temp=s.substring(left,right);
            }
            left--;
            right++;
        }

        return temp;
    }
}
