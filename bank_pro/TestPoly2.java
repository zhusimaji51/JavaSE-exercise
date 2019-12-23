package bank_pro;

public class TestPoly2 {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.name = "Tom";

        /*Bus bus = new Bus();
        bus.seatNum = 10;
        bus.type = "公交车";
        bus.speed = 30;
        bus.price = 3600D;

        Car car = new Car();
        car.brand = "BM";
        car.price = 390000D;
        car.speed = 50;
        car.type = "小汽车";

        em.goHome(bus);
        em.goHome(car);*/
        Vehicle vehicle = em.buyVehicle(1200000);

        if (vehicle!=null){
            em.goHome(vehicle);
        }

        if (vehicle instanceof Bus){
            Bus bus = (Bus)vehicle;
            System.out.println(bus.seatNum);
        }else if (vehicle instanceof Car){
            Car car = (Car)vehicle;
            System.out.println(car.brand);
        }else if (vehicle instanceof Bicycle){
            Bicycle bi = (Bicycle)vehicle;
            System.out.println(bi.color);
        }
        System.out.println("over");


    }
}

class Vehicle{
    String type;
    int speed;
    double price;

    public void run(){
        System.out.println("一辆"+this.price+"元钱的"+this.type+",以"+this.speed+"码的速度行驶");
    }
}

class Bus extends Vehicle{
    int seatNum;

    public void run(){
        System.out.println("一辆"+this.price+"元钱的"+"有"+this.seatNum+"个座位的"+this.type+",以"+this.speed+"码的速度行驶");
    }
}

class Car extends Vehicle{
    String brand;

    public void run(){
        System.out.println("一辆"+this.price+"元钱的"+this.brand+"品牌的"+this.type+",以"+this.speed+"码的速度行驶");
    }
}

class Bicycle extends Vehicle{
    String color;

    public void run(){
        System.out.println("一辆"+this.price+"元钱的"+this.color+"的"+this.type+",以"+this.speed+"码的速度行驶");
    }
}

class Employee{
    String name;

    public Vehicle buyVehicle(int money){
        Vehicle v = null;

        if (money>1000000){
            Bus bus=new Bus();
            bus.seatNum = 10;
            bus.type = "公交车";
            bus.speed = 30;
            bus.price = 3600D;
            v=bus;
        }else if (money>600000){
            Car car=new Car();
            car.brand="BM";
            v=car;
        }else if (money>2000){
            v=new Bicycle();
        }
        return v;
    }

    public void goHome(Vehicle ve){
        System.out.print(this.name+"正在乘坐");
        ve.run();
    }
}