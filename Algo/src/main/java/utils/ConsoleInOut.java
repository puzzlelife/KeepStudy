package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInOut {
    public static String getLine(){
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }

    public static String getString(){
        Scanner sc=new Scanner(System.in);
        return sc.next();
    }

    public static int getInt(){
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }

    public static List<String> getStrList(){
        Scanner sc=new Scanner(System.in);
        List<String> strList=new ArrayList<String>();
        while (!sc.hasNext("#")){
            strList.add(sc.next());
        }
        return strList;
    }
    public static List<String> getLineList(){
        Scanner sc=new Scanner(System.in);
        List<String> strList=new ArrayList<String>();
        while (sc.hasNext()){
            strList.add(sc.nextLine());
        }
        return strList;
    }
    public static List<Integer> getIntList(){
        Scanner sc=new Scanner(System.in);
        List<Integer> intList=new ArrayList<Integer>();
        while (sc.hasNextInt()){
            intList.add(sc.nextInt());
        }
        return intList;
    }
}
