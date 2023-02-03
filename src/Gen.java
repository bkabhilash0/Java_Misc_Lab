public class Gen <T>{
    T data;
    Gen(T data){
        this.data = data;
    }

    void print(){
        System.out.println(this.data);
    }
}
