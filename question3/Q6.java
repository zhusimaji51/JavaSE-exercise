package question3;

public class Q6 {
    public static void main(String[] args) {
        System.out.println(jiecheng());
    }

    public static int jiecheng(){
        for (int i = 100 ; i <=999 ; i++){
            int ge = i%10; //获取个位
            int shi = (i/10)%10; //获取十位
            int bai = (i/100)%10; //获取百位

            int res = jiecheng1(ge)+jiecheng1(shi)+jiecheng1(bai);
            if (i==res){
                return i;
            }
        }
        return 0;
    }

    public static int jiecheng1(int n){
//        if (n==1){
//            return 1;
//        }
//        return n*jiecheng1(n-1);
        int sum = 1;
        for (int i = 2 ; i <= n ; i++){
            sum*=i;
        }
        return sum;
    }
}
