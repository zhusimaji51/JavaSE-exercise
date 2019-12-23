package question1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double input = sc.nextDouble()-262;
        int initial = 3500;
        double tex = input-initial;
        double money = 0;

        if (tex<=0){
            System.out.println("免税");
        }
        if (tex<=1500){
            money = tex*0.03;
        }else if (tex<=4500){
            money = tex*0.1-105;
        }else if (tex<=9000){
            money = tex*0.2-555;
        }else if (tex<=35000){
            money = tex*0.25-1005;
        }else if (tex<=80000){
            money = tex*0.35-5505;
        }else {
            money = tex*0.45-13505;
        }
        System.out.println("实发工资:"+(input-money));
    }
}
