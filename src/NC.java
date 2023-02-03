public class NC {
    int a;
    NC(){
        this.a = 10;
    }
     class H{
        static String name = "Abhilash";
        void print(){
            System.out.println("Nested Class "+a);
        }
    }

    public static void main(String[] args) {
        new NC().new H().print();
    }
}
