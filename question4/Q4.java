package question4;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(arrayMax(new int[]{7,8,9,5,45,5,6,1,3,8}));
        System.out.println(arrayMin(new int[]{7,8,9,5,45,5,6,1,3,8}));
    }

    public static int arrayMax(int[] array){
        if (array == null || array.length == 0) return -1;
        int max = array[0];
        for (int i = 1 ; i< array.length ; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int arrayMin(int[] array){
        if (array == null || array.length == 0) return -1;
        int min = array[0];
        for (int i = 1 ; i< array.length ; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
