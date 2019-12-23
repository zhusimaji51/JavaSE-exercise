package question4;

public class Q5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        printArray(a);
        reserve(a);
        printArray(a);
    }

    public static void reserve(int[] array){
        for (int i = 0 ; i< array.length/2 ; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }
    public static void printArray(int[] array){
        for (int i = 0 ; i<array.length ; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
