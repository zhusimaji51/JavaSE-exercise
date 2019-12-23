package Day_9.AccessRange_3;

import Day_9.AccessRange_3.p1.Father;
import Day_9.AccessRange_3.p1.Son;

public class TestAccessRange extends Father{
	public void dd(){
		System.out.println(field);
	}

	public static void main(String[] args){
		
//		Father f = new Father();
		
		//f.sayHi();//公开的方法，任何位置都可以访问
		
//		System.out.println(f.field);//AccessRange与Father在同包中，允许访问
		TestAccessRange d = new TestAccessRange();
		d.dd();
//		Son son = new Son();
//		Father f = new Father();

//		System.out.println(son.field);
//		son.method();
	}
}