package Day_11.Test_4;

public class TestMain{
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		
		System.out.println(mc1.i);
		
		MyClass mc2 = new MyClass(10);
		
		System.out.println(mc2.i);
		
		System.out.println(mc1.i +"\t"+ MyClass.i);
	}
}

class MyClass{
	static int i = 10;
	
	static{
		i = 20;
		System.out.println("In Static");
	}
	
	public MyClass(){
		System.out.println("MyClass()");
	}
	
	public MyClass(int i){
		System.out.println("MyClass(int i)");
		this.i = i;
	}
}