

interface MyBoom{
    @SuppressWarnings("THis is a derecated Method")


     void mainesh();

}

     class MyChecker implements MyBoom{


    public int MainWhat()
    {
        int a;
        int b;
        a=80;
        b=50;
        return a+b;
    }
    @Deprecated
    @SuppressWarnings("THis is a derecated Method")
   public void mainesh()
    {
        System.out.println("Used to see what effect will it show on running a deprecated anntation");
    }
}
class MyRoom extends MyChecker{
    @Override

    public int MainWhat()
    {
        int l=558;
        int kl=511;
        return l+kl;
    }
}
public class Annotations_java {
    public static void main(String[] args) {

//       MyBoom obj =()-> {//This is the lamda expression and it can be used when we have only one interface method. Just use this as the syntax.
//           System.out.println("This is the method defined in the Myboom interface");
//       };
        MyBoom obj= () -> System.out.println("My name is manish and i am a human being");
        obj.mainesh();
//
//        obj.mainesh();



    }
}