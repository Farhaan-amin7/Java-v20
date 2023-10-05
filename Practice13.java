package Java.Practice;

class Phone{

    public void  ShowTime(int x)
    {
        System.out.println("The time is 9.37am");
    }
    public void ShowApps()
    {
        System.out.println("You have 25 apps in you Phone");
    }
}
class Smartphone extends Phone
{

    public void ShowTime()
    {
        System.out.println("The time is 9.40 in the SmartPhone");
    }
    public void Calling()
    {
        System.out.println("Somebody is calling your SmartPhone");
    }
}
public class Practice13 {
    public static void main(String[] args) {
        Phone Samsung =new Smartphone();
        Smartphone xoimi =new Smartphone();
        Samsung.ShowApps();
        Samsung.ShowTime(2);
        xoimi.Calling();
        xoimi.ShowTime();

    }
}
