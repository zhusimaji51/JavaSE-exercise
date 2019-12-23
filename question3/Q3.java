package question3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = sum(input);
        System.out.println("1到"+input+"的和为"+result);

        int result2 = sum2(input);
        System.out.println("1到"+input+"的和为"+result2);

    }

    public static int sum(int n){ //recursion
        if ( n==1 ){
            return 1;
        }
        return n+sum(n-1);
    }

    public static int sum2(int n){ //nonrecursion
        int sum = 0;
        for (int i = 1 ; i <= n ; i++){
//            sum = sum + i;
            sum+=i;
        }
        return sum;
    }
}
