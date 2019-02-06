package arrayAndstring;

import utils.ConsoleInOut;

public class eight16 {

    /**
     * 给定一个N*N矩阵表示的图像，其中每个像素的大小为4字节，编写一个方法，将图像旋转90度。
     * 不占用额外存储空间
     */

    public static void main(String[] args) {
        int num= ConsoleInOut.getInt();
        int[][] sourceArray=new int[num][num];
        for(int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                sourceArray[i][j]=ConsoleInOut.getInt();
            }
        }

        System.out.println("source array:");
        for(int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                System.out.print(sourceArray[i][j]+" ");
            }
            System.out.println();
        }


        rotate(sourceArray,num);
    }

    public static void rotate(int[][] array,int num){
        for(int i=0;i<num/2;i++){
            for (int j=i;j<num-i-1;j++){
                int temp=array[i][j];
                array[i][j]=array[num-1-j][i];
                array[num-1-j][i]=array[num-i-1][num-1-j];
                array[num-i-1][num-1-j]=array[j][num-i-1];
                array[j][num-i-1]=temp;
            }
        }
        System.out.println("target array:");
        for(int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


    }

}