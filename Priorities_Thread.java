class Myth2 extends Thread{
    public Myth2(String Name)
    {
        super(Name);
    }

    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("My name is thread :" + this.getName());
            i++;
        }
    }
}
public class Priorities_Thread {
    public static void main(String[] args) {
Myth2 t1= new Myth2("one(Most important)");
Myth2 t2= new Myth2("Two");
Myth2 t3= new Myth2("Three");
Myth2 t4= new Myth2("Four");
Myth2 t5= new Myth2("Five(Less important)");
t1.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.setPriority(Thread.NORM_PRIORITY);
t2.start();
t3.start();
t4.start();
t5.setPriority(Thread.MIN_PRIORITY);
t5.start();
    }
}