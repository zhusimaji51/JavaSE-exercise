package question3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        factor(input);
    }

    public static void factor(int m){
        for(int i = 1 ; i <=m ; i++){
            if (m%i == 0){
                System.out.print(i+"\t");
            }
        }
    }
}
