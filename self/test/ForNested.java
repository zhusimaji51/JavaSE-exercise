package self.test;

import java.util.Scanner;

public class ForNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cout = 0;
        int input = 0;

        do{
            if (cout > 0 && cout < 3){
                System.out.println("错误重新输入");
            }
            if (cout==3){
                System.out.println("三次输入错误，！！");
                break;
            }
            System.out.println("================欢迎使用ATM自动银行服务================");
            System.out.println("1：开户 2：存款 3：取款 4.转账 5.查询余额 6.修改密码 0.退出");
            System.out.println("====================================================");
            System.out.print("请输入操作编号");
            input = sc.nextInt();
            cout++;

        }while(input<0 || input>6);

        switch (input){
            case 0:
                System.out.println("执行退出功能");
                break;
            case 1:
                System.out.println("执行开户功能");
                break;
            case 2:
                System.out.println("执行存款功能");
                break;
            case 3:
                System.out.println("执行取款功能");
                break;
            case 4:
                System.out.println("执行转账功能");
                break;
            case 5:
                System.out.println("执行余额查询功能");
                break;
            case 6:
                System.out.println("执行修改密码功能");
        }





    }
}
