package question2;

public class Q3 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int i = 1;
        int j = 1;
        do {

            sum1+=i;
            i++;
        }while (i<=100);
        System.out.println(sum1);

        do {
            if (j%2!=0){
                sum2+=j;
            }
            j++;
        }while (j<=100);
        System.out.println(sum2);
    }
}
