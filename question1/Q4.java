package question1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int input = sc.nextInt();
        if ((input%4==0 && input%100!=0)||(input%400==0)){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
