package self.test;

import java.util.Scanner;

public class YangHui {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入杨辉三角的层数");
        int input = sc.nextInt();

        int[][] array = new int[input][];


        for (int i = 1 ; i<= input; i++){
            array[i-1] = new int[i];
        }

        for (int i = 0 ; i< array.length; i++){
            for (int j = 0 ;j <array[i].length; j++){
                if (j ==0 || j==array[i].length-1){
                    array[i][j] = 1;
                }else {
                    array[i][j] = array[i-1][j-1]+array[i-1][j];
                }
            }
        }

        for(int i = 0 ; i < array.length ; i++){//i = 2  确定需要遍历的高维的下标

//            for (int k = array.length-i-1 ;k>0 ; k-- ){
//                System.out.print(" ");
//            }
            for(int j = 0; j < array[i].length ; j++){
                System.out.print( array[i][j] +" " );
            }
            System.out.println();

        }
    }
}

