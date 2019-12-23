package question8;

public class Q11 {
    public static void main(String[] args) {
        UseTool useTool = new UseTool(new Prime());
        useTool.gold(10);
    }
}

class UseTool{
    MathTool mathTool;

    public UseTool(MathTool mathTool){
        this.mathTool = mathTool;
    }

    public void gold(int n){
        for (int i = 2 ; i<=n/2 ; i++){
            int other = n-i;
            if (mathTool.isPrime(i) && mathTool.isPrime(other)){
                System.out.println(i+"\t"+other);
            }
        }
    }
}

class Prime implements MathTool{
    public boolean isPrime(int n){
        for (int i = 2 ; i<Math.sqrt(n) ; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}

interface MathTool{
    boolean isPrime(int n);
}

