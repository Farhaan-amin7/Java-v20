/*

 I have to create a package and name it as com.package.shape

-- This package should have the individual classes like rectangle, Square, Circle, Cylinder, Sphere
-- This class should use inheritance to cover the topics like area, parameter, surface area, volume etc. and use getters and setters to
-- Get the dimensions of the these things.
-- Write the code in notePad.



*/



class Area{
    int side;

    public void setSide(int side) {
        this.side = side;
    }


    public int WhatsTheArea()
    {
        return side*side;
    }
}
class SurfaceArea{
    float Radius;
    float Radius1;

    public void setRadius1(float radius1) {
        Radius1 = radius1;
    }

    public void setRadius(float radius) {
        Radius = radius;
    }


    public double SurfaceAreaOfCircle()
    {
        return 2*(Math.PI*Radius*Radius);
    }
    public double SurfaceAreaOfSphere()
    {
        return (4*Math.PI*Radius1*Radius1);
    }
}
class Perimeter{
    int length;
    int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }




    public int ReturnPerimeter()
    {


        return 2*(length+breadth);
    }
}
class Volume{
    float radius;
    float height;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setHeight(float height) {
        this.height = height;
    }




}
class Rectangle2 extends Perimeter{

    public void PerimeterOfRectangle()
    {
        System.out.println("The perimeter of the rectangle is :" + ReturnPerimeter() );

    }

}
class Circle extends SurfaceArea{
         public void CircleSurfaceArea()
         {
             System.out.println("The surface area of the circle is :" + SurfaceAreaOfCircle());
         }
}
class Square1 extends Area{

    public void AreaOfSquare()
    {
        System.out.println("The area of the square is "+ WhatsTheArea());
    }
}
class Sphere extends SurfaceArea{

public void SphereSurfaceArea()
{
    System.out.println("The surface area of the sphere is :" + SurfaceAreaOfSphere());
}
}

class Cylinder7 extends Volume{
    public void VolumeOfTheCylinder()
    {
        float VolumeCylinder = (float)(2*Math.PI*radius*height);
        System.out.println("The Volume of the cylinder is :" + VolumeCylinder);
    }


}
public class Exercise_5_{
    public static void main(String [] args){
        Cylinder7 jvm = new Cylinder7();
        jvm.setRadius(15);
        jvm.setHeight(77);
        jvm.VolumeOfTheCylinder();
        Rectangle2 rect = new Rectangle2();
        rect.setBreadth(65);
        rect.setLength(52);
        rect.PerimeterOfRectangle();
        Circle circus = new Circle();
        circus.setRadius(3);
        circus.CircleSurfaceArea();
        circus.setRadius1(36);
        Sphere sp = new Sphere();
        sp.setRadius1(36);
        sp.SphereSurfaceArea();
        Square1 sq = new Square1();
        sq.setSide(8);
        sq.AreaOfSquare();









    }


}