package self.test;

public class SelectSort {
    public static void main(String[] args) {
        int[] a = {3,4,5,2,1};  //升序

        for (int j = 0 ; j< a.length-1 ; j++){
            for (int i = j+1 ; i<a.length ; i++){
                if (a[j] > a[i]){
                    int temp;
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            printArray(a);
        }
    }

    public static void printArray(int[] array){
        for (int i= 0 ; i< array.length ;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}

