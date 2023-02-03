public class Cl implements Cloneable {
    int a;

    Cl(int a) {
        this.a = a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Cl c1 = new Cl(10);
        System.out.println(c1.a);
        try {
            Cl c2 = (Cl) c1.clone();
            Cl c3 = c1;

            c2.a = 20;
            System.out.println(c1.a);
            System.out.println(c2.a);
            System.out.println(c3.a);

            c3.a = 30;
            System.out.println(c1.a);
            System.out.println(c2.a);
            System.out.println(c3.a);
            System.out.println(int[].class.getName());
            int[] arr = new int[]{1,2,3,4};
            int[] arr_2 = new int[4];
            System.arraycopy(arr,0,arr_2,0,arr.length-1);
        } catch (CloneNotSupportedException c) {
            System.out.println("Clone not Supported");
        }

    }
}
