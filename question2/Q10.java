package question2;

public class Q10 {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 9 ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
