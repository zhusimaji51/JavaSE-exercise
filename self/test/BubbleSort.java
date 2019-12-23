package self.test;

public class BubbleSort {
    public static void main(String[] args) {

        int[] a = {3,4,5,2,1};  //升序
        int temp;

        for (int j =1 ; j<a.length ;j++){
            for (int i = 0 ; i<a.length-j ; i++){
                if (a[i]>a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        printArray(a);
    }
    public static void printArray(int[] array){
        for (int i = 0 ; i< array.length ; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
