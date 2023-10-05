

import com.sun.source.tree.BreakTree;

class Cylinder{

     private float Radius;
    private float Height;

    public void setRadius(float r)
    {
        this.Radius=r;
    }

    public float getRadius() {
        return Radius;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float height) {
        Height = height;
    }

    public double Areaofcircle(float h, float r)
    {
        return Math.PI*h*r*r;
    }
    public double SurfaceArea(float r1,float h1)/*math.pi is used for the actual value of the pi*/
    {
        return 2*Math.PI*r1*h1+2*Math.PI*r1*r1;

    }
}
class Rectangle
{
    int Length;
    int Breadth;

    public Rectangle() {/*COnstructor which has 0 parameters*/
        Length=5;
        Breadth =4;
    }

    public int getLength() {/*Used to print the length of the rectangle*/
        return Length;
    }

    public int getBreadth() {/*Used to print the Breadth of the rectangle*/
        return Breadth;
    }

    public Rectangle(int length, int breadth) {/*This constructor is used for Constructor overloading in java*/
        Length = length;
        Breadth = breadth;
    }
}
public class Practice10 {
    public static void main(String[] args) {
        Cylinder Book=new Cylinder();
        Rectangle r=new Rectangle(12,13);
        System.out.println(r.Breadth);
        System.out.println(r.Length);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());


        Book.setHeight(10.5f);
        System.out.println(Book.getHeight());
        Book.setRadius(5.5f);
        System.out.println(Book.getRadius());
        System.out.println("The Area of the Circle is "+Book.Areaofcircle(10.5f,5.5f));
        System.out.println(Book.SurfaceArea(5.5f,10.5f));

    }
}