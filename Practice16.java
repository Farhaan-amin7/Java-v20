package Java.Practice;
 abstract class Kitchen{
     public Kitchen()
     {
         System.out.println("I am a constructor");
     }
     abstract void Knife();//its also a method so it has to be called in order to get the desired output.
     abstract void Knife2();//call it by the object you have made in the main section.

}
class Desk extends Kitchen{

    @Override
    public void Knife() {
        System.out.println("Hey its the  best sharp knife speaking in the lobby");
    }

    @Override
    public void Knife2() {
        System.out.println("Its the 2nd best sharp best knife in the Kitchen");

    }
}

public class Practice16 {
    public static void main(String[] args) {
        Kitchen smash = new Desk();

        smash.Knife();
        smash.Knife2();


        }
    }

