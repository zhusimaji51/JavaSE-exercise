package question9;

public class Q15 {
    public static void main(String[] args) {
        String str ="ABCDEFGhijklmn1234567";
        java.util.Random random = new java.util.Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0 ; i<4; i++){
            int bound = random.nextInt(str.length());
            stringBuilder.append(str.charAt(bound));
        }
        System.out.println(stringBuilder);
    }
}
