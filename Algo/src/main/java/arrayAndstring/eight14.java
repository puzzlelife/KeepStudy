package arrayAndstring;

import utils.ConsoleInOut;

public class eight14 {
    /**
     * 编写一个方法，将字符串中的空格替换为"%20"
     * 假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的真实长度
     * java使用字符数组
     */
    public static void main(String[] args) {
        String str=ConsoleInOut.getLine();
        char[] charArray=str.toCharArray();
        int spaceCount=0;
        for (char c:charArray){
            if (c==' '){
                spaceCount++;
            }
        }
        char[] newCharArray=new char[charArray.length+spaceCount*2];
        int temp=0;
        for (int i=0;i<charArray.length;i++){
            if (charArray[i]==' '){
                newCharArray[temp+i]='%';
                newCharArray[temp+i+1]='2';
                newCharArray[temp+i+2]='0';
                temp+=2;
            }else {
                newCharArray[temp+i]=charArray[i];
            }
        }

        System.out.println(new String(newCharArray));
    }
}
