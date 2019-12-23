package question4;

public class Q6 {
    public static void main(String[] args) {
        int[] a = {1,3,2,7,5};
        bubbleSort(a);
        printArray(a);
    }

    public static void bubbleSort(int[] array){
        for (int j = 0 ; j<array.length-1; j++){
            for (int i = 0 ; i< array.length-1-j ; i++){
                if (array[i]>array[i+1]){
                    int temp =  array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
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
