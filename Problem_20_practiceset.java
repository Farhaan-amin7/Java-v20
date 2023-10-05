class Practice extends Thread{
    public void run()
    {
        int i=0;
        while (i<10)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Good morning");
            i++;
        }
    }

}
class Practice2 extends Thread{
    public void run()
    {
        int i=0;
        while (i<10)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Welcome to This class.");
            i++;
        }
    }

}
public class Problem_20_practiceset {
    public static void main(String[] args) {
        Practice p= new Practice();
        Practice2 pp=new Practice2();

        p.setPriority(6);
        pp.setPriority(9);
        System.out.println(p.getPriority());
        System.out.println(pp.getPriority());
        System.out.println(p.getState());

        p.start();
        System.out.println(p.getState());
        System.out.println(Thread.currentThread());
        pp.start();

    }
}