package question10;

import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入年份");
//        String year = sc.next();
//        if (BallTeam.maps.get(year)!=null){
//            System.out.println(year+"年夺冠的队伍是"+BallTeam.maps.get(year));
//        }else {
//            System.out.println("没有举办世界杯");
//        }

        String country = sc.next();
        printYear(country);
    }

    public static void printYear(String country){
        boolean isChampion = false;
        for (Map.Entry<String,String> en:BallTeam.maps.entrySet()
             ) {
            if (en.getValue().equals(country)){
                isChampion = true;
                System.out.print(en.getKey()+"\t");
            }
        }
        if (!isChampion){
            System.out.println("没有获得过世界杯");
        }

    }
}

class BallTeam{
    public static final Map<String,String> maps = new TreeMap<>();
    static {
        maps.put("1930","乌拉圭");
        maps.put("1934","意大利");
        maps.put("1938","意大利");
        maps.put("1950","乌拉圭");
        maps.put("1954","德国");
        maps.put("1958","巴西");
        maps.put("1962","巴西");
        maps.put("1966","英格兰");
        maps.put("1970","巴西");
        maps.put("1974","德国");
        maps.put("1978","阿根廷");
        maps.put("1982","意大利");
        maps.put("1986","阿根廷");
        maps.put("1990","德国");
        maps.put("1994","巴西");
        maps.put("1998","法国");
        maps.put("2002","巴西");
        maps.put("2006","意大利");
    }
}
