

class Mytheory1{
    public Mytheory1()
    {
        System.out.println("This is the constructor of the new Theory class");
    }
    public void negative()
    {
        System.out.println("Never be negative in your life.");
    }
    void greet()
    {
        System.out.println("Good Afternoon.");
    }
}
 interface Father1{
    void FatherTheory();
    void FatherTheory2();
}
interface GrandFather{
    void GrandFatherTheory1();
    void GrandFatherTheory2();
}
class MyTheory extends Mytheory1 implements Father1,GrandFather{
     public MyTheory(){
         System.out.println("this is a constructor check");
    }
    public void FatherTheory()
    {
        System.out.println("I am the father and this is my theory");
    }
    public void FatherTheory2()
    {
        System.out.println("This is my second Theory and its entitled");
    }
    public void GrandFatherTheory1()
    {
        System.out.println("I am the GrandFather and this is my room");
    }
    public void GrandFatherTheory2()
    {
        System.out.println("This is the GrandFather speaking, Bring a blanket asap");
    }
}
public class polymorphism_Practice17 {

    public static void main(String[] args) {
        MyTheory mt=new MyTheory();
        mt.FatherTheory();
        mt.GrandFatherTheory1();
        mt.FatherTheory2();
        mt.GrandFatherTheory2();
        mt.greet();
        mt.negative();

    }
}