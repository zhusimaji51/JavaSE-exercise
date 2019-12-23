package question3;

public class Q5 {
    public static void main(String[] args) {

        System.out.println(weishu(12134354));
        System.out.println(weishu2(12134354));

    }

    public static int weishu(int n){ //recursion
        if (n/10 == 0){//1位数除10为0
            return 1;
        }
        return 1+weishu(n/10);
    }

    public static int weishu2(int n){ //nonrecursion
        int count = 0;
        do {
            count++;
            n/=10;
        }while (n!=0);//1位数除10为0
        return count;
    }
}
