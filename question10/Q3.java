package question10;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hello");
        list.add("Learn");
        list.add("Hello");

        list.remove("Hello");
        list.remove(0);

        for (String str:list
             ) {
            System.out.println(str);
        }
    }
}
