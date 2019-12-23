package question2;

public class Q6 {
    public static void main(String[] args) {
        for (int i = 0 ; i <= 33 ; i++){      // i只公鸡
            for (int j = 0 ; j <= 50 ; j++){  // j只母鸡

                int k = 100 - i - j;
                if (k%3!=0){
                    continue;
                }
                if (3*i + 2*j + k/3 ==100){ //钱
                    System.out.print("公鸡"+i+"只");
                    System.out.print("母鸡"+j+"只");
                    System.out.println("小鸡"+k+"只");

                }
            }
        }
    }
}
