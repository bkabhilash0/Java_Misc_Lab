class Recursion{
    int func(int n){
        int result;
        if(n == 1){
            return 1;
        }
        result = func(n-1);
        return result;
    }
}

public class Qn_2 {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.func(5));
    }
}
