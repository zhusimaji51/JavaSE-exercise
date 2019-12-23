package Day_8.Bank_3;

import java.util.Random;
import java.util.Scanner;

public class Test {

    java.util.Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String strsum = "";
        for (int i = 0 ; i<7; i++){
            int random = new Random().nextInt(10);
            strsum += random;
        }
        System.out.println(strsum);
    }



}
