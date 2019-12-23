package question2;
/*

 */
public class Q8 {
    public static void main(String[] args) {
        for (int i = 1000 ; i <=9999 ; i++ ){

            int ab = i/100;           // i 是 abcd
            int cd = i%100;

            if ((ab + cd)*(ab + cd)==i){
                System.out.println(i);
            }
        }
    }
}
