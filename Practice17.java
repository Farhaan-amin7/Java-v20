//interface BasicAnimal{
//
//
//    public void Eat();
//    public void Sleep();
//}
 abstract class Telephone {
   abstract void Ring();
    abstract void Lift();

    abstract void Disconnect();
}
class SmartPhone extends Telephone{
    @Override
    void Disconnect() {
        System.out.println("Disconnecting the call");

    }

    @Override
    void Lift() {
        System.out.println("Hey! I am going the same way do you want a lift.");

    }

    @Override
    void Ring() {
        System.out.println("Your phone is ringing");

    }
    void Run()
    {
        System.out.println("Running faster than 90% of the people.");
    }
}
public class Practice17 {
    public static void main(String[] args) {
        Telephone n=new SmartPhone();/*This a basic example of the polymorphism*/
        n.Disconnect();
        n.Lift();
        n.Ring();
//        n.Run();This will throw an error because Telephone reference does not include this method
    }
}
