package Day_16.sets;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {

		//有序
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("B");
		set.add("A");
		set.add("D");
		set.add("C");
		set.add("E");
		
		for(Object obj : set){
			System.out.println(obj);
		}
		
	}

}
