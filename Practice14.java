package Java.Practice;

class Circle{
    float Radius3;


    public Circle(float j)
    {
        this.Radius3=j;
//        System.out.println("The Radius of the Circle is "+this.Radius//it before giving the radius any value
    }
    public float Area()
    {
        return (float) (Math.PI*this.Radius3*this.Radius3);
    }

}
class Cylinder4 extends Circle{
   float height1;

   public Cylinder4(float j, float k)
   {
       super(j);

       this.height1=k;
   }
    public float  AreaC()
    {
        return(float) (Math.PI*Radius3*Radius3*height1);
    }

}

public class Practice14 {
    public static void main(String[] args) {
        Circle Green=new Circle( 0);
        Cylinder4 Cone=new Cylinder4(5.5f,3.5f);
//        System.out.println("The Area of the circle is "+Green.Area());
        System.out.println("The Area of the Cylinder is " +Cone.AreaC());
//        System.out.println("The Radius of the Circle is "+Green.Radius3);


    }
}
