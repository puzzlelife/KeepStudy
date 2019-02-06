package arrayAndstring;

import utils.ConsoleInOut;

public class eight17 {
    /**
     * 编写一个算法，若M*N矩阵中某个元素为0，则将其所在的行和列清零
     */

    public static void main(String[] args) {
        int row= ConsoleInOut.getInt();
        int column=ConsoleInOut.getInt();

        int[][] array=new int[row][column];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                array[i][j]=ConsoleInOut.getInt();
            }
        }

        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


        boolean[] rowZero=new boolean[row];
        boolean[] columnZero=new boolean[column];


        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (array[i][j]==0){
                    rowZero[i]=true;
                    columnZero[j]=true;
                }
            }
        }

        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (rowZero[i]==true||columnZero[j]==true){

                    array[i][j]=0;
                }
            }
        }

        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


    }


}
