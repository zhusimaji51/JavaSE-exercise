package question10;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q14 {
    public static void main(String[] args) {
        String str = "dasdasfsiiiiidsmpcmianbquxzicvusdwiigf";
        Map<Character,Integer> maps= new TreeMap<>();

        for (int i = 0; i <str.length() ; i++) {
            if (maps.containsKey(str.charAt(i))){
                maps.put(str.charAt(i),maps.get(str.charAt(i))+1);
            }else {
                maps.put(str.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer> map:maps.entrySet()
             ) {
            System.out.println(map);
        }
    }
}


