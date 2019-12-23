package question6;

public class Q14 {

    private String name;
    private int age;
    private PostAddress pa;
    private String mobile;

    public Q14() {
    }

    public Q14(String name, int age, String address, String zipCode, String mobile) {
        this.pa = new PostAddress(zipCode,address);
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public PostAddress getPostAddress(){

        return this.pa;
    }
}

class PostAddress{
    private String zipCode;
    private String Address;

    public PostAddress() {
    }

    public PostAddress(String zipCode, String address) {
        this.zipCode = zipCode;
        this.Address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

}

class Test{
    public static void main(String[] args) {
        Q14 q = new Q14("123",12,"北京","450000","18237745465");
        PostAddress postAddress = q.getPostAddress();
        System.out.println(postAddress.getAddress());
        System.out.println(postAddress.getZipCode());
    }
}
