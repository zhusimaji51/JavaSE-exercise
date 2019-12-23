package question2;

public class Q7 {
    public static void main(String[] args) {
        for (int i = 0 ; i <= 9 ; i++){
            for (int j = 0 ; j <= 12 ; j++){
                int k = 36 - i - j;
                if (k%2!=0){
                    continue;
                }
                if (4*i + 3*j + k/2 ==36){
                    System.out.print("男"+ i);
                    System.out.print("女"+ j);
                    System.out.println("小孩"+ k);
                }

            }
        }
    }
}
