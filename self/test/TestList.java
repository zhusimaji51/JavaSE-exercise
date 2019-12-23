package self.test;

public class TestList {

    static int[] nums = new int[5];
    static int size = 0; //有效元素保证连续

    public static void main(String[] args) {

        insert(0,11);

        insert(1,22);

        insert(2,33);

        insert(3,44);

        insert(4,55);

        print();

        insert(5,66);

        print();

        remove(0);

        print();

        replace(2,99);

        print();

        remove(4);

        print();
    }

    public static void insert(int position, int value){   // 位置0插入55

        //判断插入是否合理
        if (position > size || position < 0){
            System.out.println("请输入一个0~"+size+"之间的整数");
            return;
        }

        // 扩容
        if (size == nums.length){
            expand();
        }


        for (int i = size-1 ; i>=position ; i--){
            nums[i+1]=nums[i];
        }

        nums[position] = value;
        size++;
    }

    public static void remove(int position){
        if (position<0 || position>=size){
            System.out.println("请输入一个0~"+(size-1)+"之间的数");
            return;
        }
        if (size==0){
            System.out.println("数组长度为空无法删除");
            return;
        }
        for (int i = position+1; i<size ;i++){
            nums[i-1]=nums[i];
        }
        size--;

    }


    public static void replace(int position , int value){
        nums[position]=value;
    }

    //数组的扩容
    public static void expand(){
        //获得新数组(带有原值)

//          nums = java.util.Arrays.copyOf(nums,nums.length*2); //0x0000B002

        int[] newArray = new int[nums.length*2];
        for (int i = 0 ; i < nums.length ; i++){
            newArray[i]=nums[i];
        }
        //替换引用
        nums = newArray;
    }

    public static void print(){
        for (int i = 0 ; i<size; i++){
            System.out.print(nums[i]+"\t");
        }
        System.out.println();
    }
}
