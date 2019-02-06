package arrayAndstring;

import utils.ConsoleInOut;


public class eight13 {
    /**
     * 给定两个字符串，确定其中一个字符串的字符重新排列后，能否变成另一个字符串
     */
    public static void main(String[] args) {
        String str1= ConsoleInOut.getString();
        String str2= ConsoleInOut.getString();

        sortWay(str1,str2);

        countWay(str1,str2);

    }

    private static void countWay(String str1, String str2) {

    }

    private static void sortWay(String str1,String str2){
        str1=sort(str1);
        str2=sort(str2);

        System.out.println("sort way:"+str1.equals(str2));
    }

    private static String sort(String str){
        char[] charArray=str.toCharArray();
        for (int i=0;i<charArray.length;i++){
            for(int j=0;j<i;j++){
                if (charArray[i]<charArray[j]){
                    char temp=charArray[i];
                    charArray[i]=charArray[j];
                    charArray[j]=temp;
                }
            }

        }
        return new String(charArray);
    }
}
