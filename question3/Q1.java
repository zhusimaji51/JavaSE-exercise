package question3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int result = add(input1,input2);
        System.out.println("a+b="+result);
    }

    public static int add(int a , int b){
        return (a+b);
    }
}
