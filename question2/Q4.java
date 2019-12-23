package question2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小于10的整数");

        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n ; i++){
            sum*=i;
        }
        System.out.println(sum);

    }
}
