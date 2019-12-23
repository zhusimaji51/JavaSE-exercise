package Day_6.Sort_3;

public class TestJDKSort{
	public static void main(String[] args){

		int[] nums = {4,3,5,2,1};


		java.util.Arrays.sort(nums);//只能做升序

		//元素的倒置

		printArray(nums);

		reverse(nums);

		printArray(nums);

	}


	public static void printArray(int[] nums){
		for(int i = 0 ; i < nums.length ; i++){
			System.out.print(nums[i] +"\t");
		}
		System.out.println();
	}

	
	public static void mySort(int[] nums){
		for(int i = 0 ; i < nums.length - 1 ; i++){
			
			for(int j = i+1 ; j < nums.length ; j++){
			
				if(nums[i] > nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
			
		}
		
	}

	public static void reverse(int[] a){
		for (int i = 0 ; i<a.length/2 ;i++){
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
	}
}