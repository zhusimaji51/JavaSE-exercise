package question1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数(表示年龄)");
        int input = sc.nextInt();
        if (input>0){
            if (input<6){
                System.out.println("儿童");
            }else if (input<14){
                System.out.println("少儿");
            }else if (input<18){
                System.out.println("青少年");
            }else if (input<36){
                System.out.println("青年");
            }else if (input<51){
                System.out.println("中年");
            }else {
                System.out.println("中老年");
            }
        }

    }
}
