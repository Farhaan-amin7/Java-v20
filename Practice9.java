import java.awt.geom.Area;

class Square{
    int side;
    public int Getside()
    {
       return side;
    }
    public int Area()
    {
       return side*side;
    }
    public float Perimeter()
    {
        return 4*side;
    }


}
public class Practice9 {
    public static void main(String[] args) {
        Square first=new Square();
        first.side=10;
        System.out.println("Each side of the square is "+first.side);
        System.out.println(first.Area());
        System.out.println(first.Perimeter());

            }
}
