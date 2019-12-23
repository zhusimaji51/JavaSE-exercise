package self.test;

public class MInMax {
    public static void main(String[] args) {
        int[] a = {1,5,8,6,555,-9,-4};
        MinMax(a);
    }

    public static void MinMax(int[] array){
        if (array==null || array.length==0) return;
        int Max = array[0], Min = array[0];
        for (int i = 1 ; i< array.length ; i++){
            if (Max<array[i]){
                Max=array[i];
                continue;
            }
            if (Min>array[i]){
                Min = array[i];
            }
        }
        System.out.println("Max: "+Max);
        System.out.println("Min: "+Min);
    }
}
