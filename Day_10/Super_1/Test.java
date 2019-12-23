package Day_10.Super_1;

public class Test{
	public static void main(String[] args){
	
		ClassB b = new ClassB(10);
		
		System.out.println(b.value);
	
	
		ClassA a = new ClassA(20);
		
		System.out.println(a.value);
	}
}


class ClassA{
	int value;
	
	public ClassA(){
		
	}
	
	public ClassA(int value){
		this.value = value;
	}
}

class ClassB extends ClassA{
	public ClassB(){
		super();//默认
	}
	
	public ClassB(int value){
		this();//super();
	}
	
	public ClassB(int a , int b){
		this(1);//默认
	}
}





