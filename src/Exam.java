public class Exam implements Runnable{
    int x,y;
     int addX(){
        x++;
        return x;
    }

     int addY(){
        y++;
        return y;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            synchronized (this){
                System.out.println(addX() + " "+ addY());
            }
        }
    }

    public static void main(String[] args) {
        Exam e1 = new Exam();
        Exam e2 = new Exam();

        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);

        t1.start();
        t2.start();
    }
}
