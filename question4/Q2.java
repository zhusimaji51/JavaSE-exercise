package question4;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {1,5,6,8,4,3};
        double res= calculateArrayAvg(a);
        System.out.println(res);

        System.out.println(calculateArrayAvg(new int[]{1,2,3,4,5}));

    }

    public static double calculateArrayAvg(int[] array){
        int sum = 0;
        for (int i= 0 ; i< array.length; i++){
            sum += array[i];
        }
        return (double)sum /array.length;

    }
}
