package self.test;

public class TestInstance {
    public static void main(String[] args) {
        Home home1 =new House();
        System.out.println(home1 instanceof House);
    }
}

class Home{}

class House extends Home{}