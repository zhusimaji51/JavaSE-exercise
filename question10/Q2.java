package question10;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        list.add("Hello");
        list.add("World");
        list.add(1,"Learn");
        list.add(1,"Java");
        printList(list);

    }

    public static void printList(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
