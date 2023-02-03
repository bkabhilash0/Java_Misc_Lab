public class Person {
    String name;
    int age;
    static final String greet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static {
        greet = "Hello";
    }

    void showInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Name: "+this.age);
    }

    Object walk(){
        System.out.println("Walking...");
        return 1;
    }
    static void myMethod(){
        System.out.println("I am a static Method");
    }
}

class Student extends Person{
    String role;

    Student(String name,int age,String role){
        super(name,age);
        this.role = role;
    }

    @Override
    Integer walk() {
       return 1;
    }

    static void myMethod(){
        System.out.println("This is Overridden");
    }

    public static void main(String[] args) {
        Person p =new Student("A",2,"");
        p.myMethod();
        Student s = (Student)p;
//        s.role = "Student";
        s.showInfo();
        Student s1 = new Student("B",2,"");
        s1.myMethod();
    }
}
