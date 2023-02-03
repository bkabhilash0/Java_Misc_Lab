interface Printable{
    void show();
    int MAX = 5;
     default void draw(){
         System.out.println("Drawing...");
     }
}

interface IP extends Printable{
    void bio();
}

public class Main implements Printable{
    @Override
    public void show(){
        System.out.println("Hello");
        System.out.println(MAX);
    }
    public static void main(String[] args) {
        new Main().show();
        new Main().draw();
    }
}