package arrayAndstring;

import utils.ConsoleInOut;

public class eight15 {
    /**
     * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能
     * 比如aabcccccdd压缩后为a2b1c5d2，若压缩后没有变短，则返回原先字符串
     */
    public static void main(String[] args) {
        String sourceString=ConsoleInOut.getLine();
        StringBuilder compressString=new StringBuilder("");
        compressString.append(sourceString.charAt(0));
        int count=1;
        for (int i=1;i<sourceString.length();i++){
            if (sourceString.charAt(i)==sourceString.charAt(i-1)){
                count++;
            }else {
                compressString.append(count);
                compressString.append(sourceString.charAt(i));
                count=1;
            }
        }
        compressString.append(count);

        if(sourceString.length()>compressString.length()){
            System.out.println(compressString);
        }else {
            System.out.println(sourceString);
        }
    }
}
