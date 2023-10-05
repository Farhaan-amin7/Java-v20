import static java.lang.Character.getName;

class MyRunnable implements Runnable{
    public void run() {
        int i=0;
        while(i<100) {
            System.out.println("This is the Runnable one one one");
            i++;
        }
    }
    }
class MyRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("This is the Runnable two two two ");

            i++;
        }
    }
}


public class Problem19_Runnable {
    public static void main(String[] args) {
        MyRunnable car=new MyRunnable();
        Thread fuel=new Thread(car);

        MyRunnable2 jet=new MyRunnable2();
        Thread jetfuel=new Thread(jet);

        fuel.start();
        jetfuel.start();

    }
}