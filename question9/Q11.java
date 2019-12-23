package question9;

public class Q11 {
    public static void main(String[] args) {
        String string = "zhengcg@zparkhr.com";
        String []a = string.split("@");
        System.out.println(a[0]);
//        System.out.println(string.substring(0,string.indexOf("@")));
        System.out.println(isMail(string));
    }
    public static boolean isMail(String string){
        if ((string.lastIndexOf(".")>string.lastIndexOf("@"))&&(string.contains("@")&&string.contains("."))){
            return true;
        }
        return false;

    }
}
