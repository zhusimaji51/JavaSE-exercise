package question9;

public class Q10 {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();

        class RedLight implements Light{
            @Override
            public void shine(){
                System.out.println("shine in red");
            }
        }
        lamp1.on(new RedLight());
        lamp1.on(new Light() {
            @Override
            public void shine() {
                System.out.println("shine in yellow");
            }
        });


    }
}

interface Light{
    void shine();
}

class Lamp{
    public void on(Light light){
        light.shine();
    }
}

