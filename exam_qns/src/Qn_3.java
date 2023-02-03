class Overload {
    int x;
    double y;

    Overload() {
        this.x = 0;
        this.y = 0;
    }

    void add(int a, int b) {
        x = a + b;
    }

    void add(double a, double b) {
        y = a + b;
    }
}

public class Qn_3 {
    public static void main(String[] args) {
        int a = 2;
        double b = 3.2;
        Overload obj = new Overload();
        obj.add(a, b);
        obj.add(b, b);
        System.out.println(obj.x + " " + obj.y);
    }
}

