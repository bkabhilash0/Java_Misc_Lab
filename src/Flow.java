 class Flow {
    static int a;
    int def;

    public Flow() {
        this(10);
        System.out.println("Running the Constructor");
    }

    Flow(int a) {
        System.out.println("Called using this...");
    }

    {
        System.out.println("Running the Instance Block...");
    }

     {
         System.out.println("Instance Block 2");
     }

    static {
        a = 10;
        System.out.println("Running the static block");
    }

    public static void main(String[] args) {
        new Flow();
    }
}
