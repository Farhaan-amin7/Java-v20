package Java.Practice;

class Farm
{
    public int Cock;
    public String cow;
    Farm(){
        System.out.println("This is the constuctor of the Farm class");
    }
    public Farm(int a,int b)
    {
        System.out.println("I am the constructor of the class Farm with parameters.");
    }

    public int getCock() {
        return Cock;
    }

    public String getCow() {
        return cow;
    }
}
class Shed extends Farm/*learned keyword extends which is used to attach the parent class with
the new class or the child class*/
{
    int c;
    int v;
    Shed ()
    {
        System.out.println("I am the constructor of the class Shed which extends to farm.");
    }
    public Shed(int c,int v)
    {
        System.out.println("i am the consturctor with parameters");
    }
 public void setCock(int c)
 {
    Cock=c;
 }
 public String setCow(String c)
 {
    return cow=c;
 }
}
class tools extends Shed
{
    int Axe;
    tools(int axe,int o,int p,int r)
    {

        Axe=axe;
        System.out.println("This constuctor is of the class Tools \n");
//        super(c,v);

    }
}
public class Derived {
    public static void main(String[] args) {
        Shed ok=new Shed(10,50);
//        Farm Farm1=new Farm(10,20);
        ok.setCock(100);
        System.out.println(ok.getCock());
        ok.setCow("cow says what");
        System.out.println(ok.getCow());


    }
}
