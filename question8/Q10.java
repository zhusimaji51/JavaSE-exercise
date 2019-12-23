package question8;

public class Q10 {

}

interface ServiceInterface{
    void doService1();
    void doService2();
    void doService3();
}

abstract class AbstractService implements ServiceInterface{
    public void doService1(){}
    public void doService2(){}
    public void doService3(){}
}

