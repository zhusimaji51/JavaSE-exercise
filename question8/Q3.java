package question8;

public class Q3 {
    public static void main(String[] args) {

        IC ic = new classE();
        ID id = (ID)ic;
        id.ma();
        id.mb();
        id.mc();
        id.md();
    }
}

interface IA{
    void ma();
}

interface IB extends IA{
    void mb();
}

interface IC{
    void mc();
}

interface ID extends IB,IC{
    void md();
}

class classE implements ID{
    public void md(){}
    public void ma(){}
    public void mc(){}
    public void mb(){}
}