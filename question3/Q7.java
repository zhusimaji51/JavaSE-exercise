package question3;

public class Q7 {
    public static void main(String[] args) {
//        System.out.println(factorSum(284));
        for (int i = 1 ; i<=3000 ; i++){
            int b = factorSum(i); //i的因子之和为b
            int a = factorSum(b); //b的因子之和为a
            //分析：如果a == i，意味着a的因子和为b，
            //b的因子和为a，满足亲密数的要求
            //同时，为了避免重复解，要求a < b
            if (a<b && a==i) {
                System.out.println(a+"\t"+b);
                }
            }
        }

    public static int factorSum(int m){
        int sum = 0;

        for (int i = 1 ; i<=m/2 ; i++){
            if (m%i==0){
            sum+=i;
            }
        }
        return sum;
    }
}
