package question9;

public class Q14 {
    public static void main(String[] args) {
        String a ="1239586838923173478943890234092";

        int []arrary = new int[10];//记录9个数字

        char []word = a.toCharArray();

        for(int i = 0;i<word.length;i++){
           arrary[word[i]-48]+=1;
        }
        for (int j = 0 ;j<arrary.length;j++){
            System.out.println(j+"出现了"+arrary[j]+"次");
        }

   /*
        for (int i:arrary){
            System.out.println(i); //foreach 遍历
        }
    */

    }
}
