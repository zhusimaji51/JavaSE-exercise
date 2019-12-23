package question3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 3 ; i<= n/2; i+=2){
            if (isPrime(i) && isPrime(n-i)){
                System.out.println(n+"="+i+"+"+(n-i));
            }
        }

    }

    public static boolean isPrime(int n){
        for (int i = 2 ; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
