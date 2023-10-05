

class Square{
    int side;
    public void setSide(int s)
    {
        side=s;
        System.out.println("Each side of the square is "+ this.side);
    }
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
        first.setSide(5);
        System.out.println(first.Getside());

        System.out.println(first.Area());
        System.out.println(first.Perimeter());

            }
}