package self.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bubble {
    public static void main(String[] args) {
        int[] a ={2,5,4,56,132,2,1,9,8,55,5,5,5};

        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            map.put(a[i],0);
        }

    }
}

