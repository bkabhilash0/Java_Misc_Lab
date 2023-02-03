class X{
    public X(int i){
        System.out.println(i);
    }
}

class Y extends X{
    public Y(int i){
        super(i);
        System.out.println(i);
    }
}

public class Qn_1 {
    public static void main(String[] args) {
        Y obj = new Y(5);
    }
}
