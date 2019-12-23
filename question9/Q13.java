package question9;


public class Q13 {
    public static void main(String[] args) {
        String str = java.util.UUID.randomUUID().toString();
        String newStr = str.replace("-","");
        System.out.println(str);
        System.out.println(newStr);
    }
}
