package question6;

public class Q17 {
    public static void main(String[] args) {
        SalariedEmployee s1 =new SalariedEmployee();
        s1.setName("tom");
        s1.setMonth(6);
        s1.setSalary(1200D);
//        System.out.println(s1.getName()+"的工资是"+s1.getSalary(6));

        HourlyEmployee s2 =new HourlyEmployee();
        s2.setName("bob");
        s2.setMonth(8);
        s2.setHourlySalary(100D);
        s2.setHours(120);
//        System.out.println(s2.getName()+"的工资是"+s2.getSalary(7));

        SalesEmployee s3 = new SalesEmployee();
        s3.setName("jerry");
        s3.setMonth(9);
        s3.setSales(10000D);
        s3.setRate(0.7);
//        System.out.println(s3.getName()+"的工资是"+s3.getSalary(12));

        BasePlusSalesEmployee s4= new BasePlusSalesEmployee();
        s4.setName("tony");
        s4.setMonth(1);
        s4.setBaseSalary(2000D);
        s4.setSales(6000D);
        s4.setRate(0.5);
//        System.out.println(s4.getName()+"的工资是"+s4.getSalary(1));


        Employee[] em = new Employee[]{s1,s2,s3,s4};
/*
        for (int i = 0 ; i<em.length ; i++){
            if (em[i] instanceof SalariedEmployee){
                SalariedEmployee salariedEmployee = (SalariedEmployee)em[i];
                System.out.println(salariedEmployee.getName()+"的工资是"+salariedEmployee.getSalary(9));
            }else if (em[i] instanceof HourlyEmployee){
                HourlyEmployee hourlyEmployee = (HourlyEmployee)em[i];
                System.out.println(hourlyEmployee.getSalary(7));
            }else if (em[i] instanceof SalesEmployee){
                SalesEmployee salesEmployee = (SalesEmployee)em[i];
                System.out.println(salesEmployee.getSalary(7));
            }else if (em[i] instanceof BasePlusSalesEmployee){
                BasePlusSalesEmployee basePlusSalesEmployee = (BasePlusSalesEmployee)em[i];
                System.out.println(basePlusSalesEmployee.getSalary(7));
            }
        }
*/
        double sum = 0 ;
        for (int i = 0 ; i< em.length; i++){
            if (em[i] instanceof ExtraMoney){
                ExtraMoney extraMoney = (ExtraMoney)em[i];
                sum+=extraMoney.getOvertime();
            }
        }
        System.out.println(sum);
        System.out.println("程序结束");
    }
}

class Employee{
    private String name;
    private int month;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMonth(){
        return this.month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public double getSalary(int month){
        double salary = 0D;
        if (this.month == month){
            //工资加100
            salary+=100;
        }
        return salary;
    }
}

class SalariedEmployee extends Employee implements ExtraMoney{
    private double salary;

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(int month){
        double money = super.getSalary(month);
        return this.salary+money;
    }
    public double getOvertime(){
        return 2000;
    }

}

class HourlyEmployee extends Employee{
    private double hourlySalary;
    private int hours;

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary(int month){
        double money = super.getSalary(month);
        if (hours>160){
            return 160*hourlySalary+(hours-160)*hourlySalary*1.5+money;
        }else {
            return hours*hourlySalary+money;
        }
    }

}

class SalesEmployee extends Employee{
    private double sales; //销售额
    private double rate;//提成率


    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary(int month){
        double money = super.getSalary(month);
        return sales*rate+money;
    }
}

class BasePlusSalesEmployee extends SalesEmployee implements ExtraMoney{
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(int month){
         double money = super.getSalary(month);
         return baseSalary+money;
    }
    public double getOvertime(){
        return 1000;
    }
}

interface ExtraMoney{
    double getOvertime();
}