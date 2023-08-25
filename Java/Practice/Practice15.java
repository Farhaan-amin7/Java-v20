package Java.Practice;
class Rectangle1
{
    int Breadth1,Length1;
//    public Rectangle1(int b,int l)
//    {
//        this.Breadth1=b;
//        this.Length1=l;
//    }

    public Rectangle1() {

    }
    public int AreaofRectangle(int l,int b)
    {
        this.Breadth1=b;
        this.Length1=l;
        return 2*(this.Length1+this.Breadth1);
    }
}
class Cubiod extends Rectangle1 {
    int side1;

    public Cubiod(int s) {
        side1 = s;
    }

    public int AreaofCubiod() {
    return this.side1*this.side1*this.side1;
    }
}


public class Practice15 {
    public static void main(String[] args) {
        Rectangle1 Blue=new Rectangle1();/*Any constructor can be called by Typing or giving the values of the
        the argumnets while making an object out of the class like here.*/
        System.out.println("The area of the rectangle is "+Blue.AreaofRectangle(20,20));
        Cubiod Lamda=new Cubiod(3);
        System.out.println("The Volume of the cubiod is "+ Lamda.AreaofCubiod());

    }

}
