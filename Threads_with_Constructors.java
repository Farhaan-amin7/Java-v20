class Myth extends Thread{

    public Myth(String name, Runnable r)
    {
        super(name);
        r.run();


    }
    public void run()
    {
        int i=0;
        while(i<2)
        {
            System.out.println("This is a thread named "+ getName());
            i++;
        }
    }
}
public class Threads_with_Constructors {
    public static void main(String[] args) {
        Myth t1=new Myth("Rahul",() ->{
            System.out.println("this is a lamda expression");
        });
        Myth t2=new Myth("santosh",() ->{});
        t1.start();
        t2.start();
        System.out.println("The id of the 2nd Thread is " + t2.getId());
        System.out.println("The Name of the 2nd Thread is " + t2.getName());
        System.out.println("This id of this Thread is " +t1.getId());
        System.out.println("This name of this Thread is " +t1.getName());

    }
}