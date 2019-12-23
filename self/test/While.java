package self.test;

public class While {
    public static void main(String[] args) {
//
//        int i = 1;
//        int sum = 0;
//
//        while (i<=100){
//
//            if (i%2!=0){
//                sum = sum + i;
//            }
//            i++;
//        }
//        System.out.println(sum);
        System.out.println(jiecheng1(4));
    }
    public static int jiecheng1(int n){
        if (n==1){
            return 1;
        }
        return n*jiecheng1(n-1);
    }
}
