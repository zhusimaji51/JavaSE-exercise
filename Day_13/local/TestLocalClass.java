package Day_13.local;

public class TestLocalClass {

	public static void main(String[] args) {
		Outer out = new Outer();
		
		out.m1();
		
		System.out.println(out.pr);
		
		out.pr.print();
	}

}

class Outer{
	
	int a = 10;
	
	Printable pr = null;
	
	public void m1(){
		
		String local = "Hello"; //回收时间,final延长局部变量local的生命周期
		
		class Inner implements Printable{
			int a = 20;
			
			@Override
			public void print(){
				int a = 30;
				System.out.println("Inner - m2()" + local);
			}
		}
		
		pr = new Inner();

	}

}


interface Printable{
	public void print();
}
