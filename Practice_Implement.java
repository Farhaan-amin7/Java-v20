package Java.Practice;
interface Absolute{
    int applyBrakes(int Decrement);
    int SpeedUp(int increment);
}
interface FG{
    void Ahsher();
    void fur();

}
class Atlas implements Absolute,FG {

    int speed=9;
 public int applyBrakes(int Decrement)
{
   return speed=speed-Decrement;
}
    public int SpeedUp(int increment)
{
    return speed=speed+increment;
}

    @Override
    public void Ahsher() {
        System.out.println("The Bike is faster than the Cycle.");
        System.out.println("As a human we should care about each other and we should not fight.");
    }
    @Override
    public void fur() {
        System.out.println("Train is faster than the Bike.");
    }


}

public class Practice_Implement {
    public static void main(String[] args) {
        Atlas Cycle=new Atlas();
        System.out.println("The Speed of the Cycle after applying brakes is "+ Cycle.applyBrakes(8));
        System.out.println("The Speed of the Cycle after Speeding up is "+ Cycle.SpeedUp(50));
        Cycle.Ahsher();
        Cycle.fur();

    }
}
