package self.test;

public class TestArrays {
    public static void main(String[] args) {
        int[] Array = {11,22,33,44,55};
        m2(Array);
        System.out.println(Array[0]);
    }

    public static void m2(int[] a){
        a = java.util.Arrays.copyOf(a,a.length*2);
        a[0] = 88;

    }
}
