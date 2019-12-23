package question1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 23; //结果数

        int m = 5; //单页显示数
        System.out.println("请输入需要访问的页码");
        int i = sc.nextInt();//第i页

        int totalPage = n%m==0 ? n/m : n/m+1;//总页数

        if (i==totalPage){
            System.out.println("最后一页:"+(m*(i-1)+1)+"------->"+n);
        } else if(i<totalPage) {
            System.out.println("第"+i+"页:"+(m*(i-1)+1)+"------->"+(m*i));
        }else {
            System.out.println("页数过大请重新输入页数");
        }


    }
}
