package Java.Practice;

class HeyBitch
{
    private int asher;
    private String World;

    public void setAsher(int i)
    {
        asher=i;
    }

    public int getAsher()
    {
        return asher;
    }

    public void setWorld(String k)
    {
        World=k;
    }
    public String getWorld()
    {
        return World;
    }
}
public class Constructor {
    public static void main(String[] args) {


        HeyBitch first1 = new HeyBitch();
        first1.setAsher(1000);
        System.out.println(first1.getAsher());
        first1.setWorld("I would like to visit United States of America");
        System.out.println(first1.getWorld());
        
    }
}
