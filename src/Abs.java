public abstract class Abs {
    String name;
    int age;

    public Abs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void run();
    abstract void walk();

    final void showBasicInfo(){
        System.out.println("Showing my Basic Info");
    }

    void showInfo(){
        System.out.println("Showing Info...");
    }
}
