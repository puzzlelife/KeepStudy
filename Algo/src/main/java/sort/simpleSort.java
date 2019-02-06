package sort;

import utils.FileInOut;

import java.util.List;

public class simpleSort {
    public static void main(String[] args) {
        List<String> list= FileInOut.getInputFile("input.log");
        String[] array=new String[list.size()];
        list.toArray(array);
        System.out.println("-----------输入------------");
        show(array);
        //选择排序
        selectionSort(array);
        System.out.println();

        //插入排序
        list.toArray(array);
        insertionSort(array);
        //希尔排序
        list.toArray(array);
        shellSort(array);
        //归并排序
        //快速排序
    }

    private static void selectionSort(Comparable[] a){
        System.out.println("--------选择排序---------");
        int N=a.length;
        for(int i=0;i<N;i++){
            int min=i;
            for (int j=i+1;j<N;j++){
                if (less(a[j],a[min])){
                    min=j;
                }
            }
            exec(a,min,i);
        }
        show(a);
    }
    private static void insertionSort(Comparable[] a) {
        System.out.println("--------插入排序---------");
        for (int i=0;i<a.length;i++){
            for(int j=i;j>0&&less(a[j],a[j-1]);j--){
                exec(a,j,j-1);
            }
        }
        show(a);
    }
    private static void shellSort(Comparable[] a){
        System.out.println("--------希尔排序----------");
        int N=a.length;
        int h=1;
        while (h<N/3) h=3*h+1;
        while (h>=1){
            for (int i=h;i<N;i++){
                for(int j=i;j>=h&&less(a[j],a[j-h]);j=j-h){
                    exec(a,j,j-h);
                }

            }
            h=h/3;
        }
        show(a);
    }


    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }
    private static void show(Comparable[] a) {
        System.out.print("[");
        for (Comparable anA : a) {
            System.out.print(anA + " ");
        }
        System.out.println("]");
    }
    private static void exec(Comparable[] a,int i,int j) {
        Comparable temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
