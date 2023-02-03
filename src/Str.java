import java.io.IOException;

public class Str {
    public static void main(String[] args) throws IOException {
        String name = "Abhilash";
        StringBuilder st = new StringBuilder();
//        name = "A";
        System.out.println(name.replace('A','s'));
        System.out.println(name.substring(name.length()-1));
        StringBuffer sb = new StringBuffer("Welcome");
        System.out.println(sb.charAt(5));

        for(int i=0;i < 10;i++){
            try{
                int a = 5/i;
                System.out.println(i);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Finally...");
            }
        }
    }
}
