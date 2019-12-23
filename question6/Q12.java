package question6;

public class Q12 {
    public static void main(String[] args) {
        Animal[] as = new Animal[]{
                new Dog("Pluto"),
                new Cat("Tom"),
                new Dog("Snoopy"),
                new Cat("Garfield"),
        };
    }
}

class Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name){
        super.setName(name);
    }
}

class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name){
        super.setName(name);
    }
}
