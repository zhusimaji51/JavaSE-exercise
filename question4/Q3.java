package question4;

public class Q3 {
    public static void main(String[] args) {
        int[] a = {7,5,6,74,56};
        System.out.println(elementExist(a,2));
    }

    public static int elementExist(int[] array, int n){
        for (int i = 0 ; i< array.length; i++){
            if (n==array[i]){
                return i;
            }
        }
        return -1;
    }
}
