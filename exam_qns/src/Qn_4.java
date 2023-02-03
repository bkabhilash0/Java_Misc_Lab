// Remove the final keyword as this doesn't allow a class to be inherited
class A{
    int i;
}

class B extends A{
    int j;

    void display(){
        System.out.println(j + " "+ i);
    }
}

public class Qn_4 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
