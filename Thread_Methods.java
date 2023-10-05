
class Myth3 extends Thread {
    public Myth3(String Name) {
        super(Name);
    }

    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Thank YOU");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
                System.out.println("thread was interupted");

            }

        }
    }
}
    class Mynewth3 extends Thread{


        public void run() {
            int i = 0;
            while (i < 100) {
                System.out.println("My Thank you");
                i++;
            }
        }
    }
public class Thread_Methods {
    public static void main(String[] args) {
        Myth3 t1= new Myth3("This_What");
        Mynewth3 t2= new Mynewth3();
        t1.start();
//        try{
//            Thread.sleep(500);
//        }
//            catch (Exception e){
//                System.out.println(e);
//
//            }
        t2.start();

    }
}