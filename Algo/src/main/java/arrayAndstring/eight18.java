package arrayAndstring;

public class eight18 {
    /**
     * 假定有一个算法isSubstring，可检查一个单词是否是其他字符串的子串。
     * 给定两个字符串s1和s2，请编写代码检查s2是否是s1旋转而成。
     * 要求只能调用一次isSubstring。
     * 比如waterbottle是erbottlewat旋转后的字符串
     */

    public boolean isRotation(String s1,String s2){

        String s1s1=s1+s1;
        return isSubstring(s1s1,s2);

    }

    public boolean isSubstring(String s1,String s2){

        return true;
    }
}
