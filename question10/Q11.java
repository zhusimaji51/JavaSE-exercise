package question10;

import java.util.HashMap;
import java.util.Map;

public class Q11 {
    public static void main(String[] args) {
        Map<String,String> maps = new HashMap<>();
        maps.put("Tom","CoreJava");
        maps.put("John","Oracle");
        maps.put("Susan","Oracle");
        maps.put("Jerry","JDBC");
        maps.put("Jim","Unix");
        maps.put("Kevin","JSP");
        maps.put("Lucy","JSP");

        maps.put("Allen","JDBC");
        maps.put("Lucy","CoreJava");
        for (Map.Entry<String,String> entrySet:maps.entrySet()
             ) {
            System.out.println(entrySet);
        }

        for (Map.Entry<String,String> entrySet:maps.entrySet()
             ) {
            if (entrySet.getValue().equals("JDBC")){
                System.out.println(entrySet.getKey());
            }
        }
    }
}
