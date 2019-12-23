package Day_6.ChangeLength_2;

public class TestChangeLength{
	public static void main(String[] args){
		//打印1 2 3 4 5
		
		//int[] nums = {1,2,3,4,5};
		
		printArray(1,2,3,4,5);

	}
	
	public static void printArray(int... array){
		System.out.println(array.length);
		System.out.println(array);
		/*
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i]);
		}
		*/
	}
}