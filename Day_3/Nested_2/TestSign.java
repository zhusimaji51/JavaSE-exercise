package Day_3.Nested_2;

import java.util.Scanner;
/*
*
***
*****
*******
*********
***********

&&&&&
&&&&
&&&
&&
&




&&&&&*
&&&&***
&&&*****
&&*******
&*********
***********
*/
public class TestSign{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int totalRows ;
		do{
			System.out.println("请输入菱形总行数：");
			totalRows = input.nextInt();//11
		}while(totalRows % 2 == 0);
		
		int upRows = totalRows / 2 + 1;
		int downRows = totalRows / 2;
		
		for(int i = 1 ; i <= upRows ; i++) {//i = 3

            for (int j = upRows - 1; j >= i; j--) {// j = 5
                System.out.print(" ");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {//k = 1
                System.out.print("*");
            }
            System.out.println();
		}

        for (int i2 = 1; i2 <= downRows; i2++){


            for (int j2 = 1; j2 <= i2; j2++){
                System.out.print(" ");
            }

            for (int k2 = 1; k2 <=(downRows-i2)*2+1; k2++){
                System.out.print("*");
            }
            System.out.println();
        }

	}
}









