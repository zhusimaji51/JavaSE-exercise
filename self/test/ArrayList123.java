package self.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayList123 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).toUpperCase();
            String s2= list.set(i,s);
//            System.out.println(s2);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
