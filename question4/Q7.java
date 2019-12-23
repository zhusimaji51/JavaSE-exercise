package question4;

public class Q7 {
    public static void main(String[] args) {
        int[] a = {1,3,2,7,5};
        printArray(a);
        selectSort(a);
        printArray(a);
    }

    public static void selectSort(int[] array){
        for (int j = 1  ; j<= array.length-1 ;j++){
            for (int i = j ; i< array.length ; i++){
                if (array[j-1]>array[i]){
                    int temp = array[j-1];
                    array[j-1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array){
        for (int i = 0 ; i<array.length ; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
