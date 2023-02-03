import java.nio.channels.InterruptibleChannel;

public class Sample extends Abs{

    public Sample(String name, int age) {
        super(name, age);
    }

    @Override
    void run() {

    }

    @Override
    void walk() {

    }

    @Override
    void showInfo() {
        super.showInfo();
    }

    void newM(){}

    public static void main(String[] args) {
        Abs a = new Sample("Abhi",21);
        System.out.println(null instanceof Abs);
        if(a instanceof Sample){
            Sample s = (Sample)a;
            System.out.println(s.equals(a));
        }

    }
}
