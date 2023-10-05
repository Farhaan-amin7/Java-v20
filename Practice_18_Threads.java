
  import java.lang.Thread;
class Mythread1 extends Thread{
        public void run() {
            int i = 0;
            while (i < 10) {
                System.out.println("Hi");
                try{ Thread.sleep(1000);}
                catch (Exception e){}
                i++;
            }
        }
        }
        class Mythread2 extends Thread{
            public void run()
        {
            int i=0;
            while (i<10) {
                System.out.println("hello");
                try{ Thread.sleep(1000);}
                catch (Exception e){}
                i++;
            }
        }
        }

    public class Practice_18_Threads {
    public static void main(String[] args) {
        Mythread1 t1= new Mythread1();
        Mythread2 t2=new Mythread2();
        t1.start();
        try{ Thread.sleep(100);}
        catch (Exception e){}
        t2.start();

    }
}