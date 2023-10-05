import java.util.jar.JarOutputStream;

class Pecifist{
    String Name;
    int age;

    Pecifist()
    {
        super();
        System.out.println("I am a constructor");
    }
    Pecifist(String Name,int age)
    {
        this.Name=Name;
        this.age=age;
    }
    Pecifist(Pecifist c)
    {
        System.out.println("The copy constructor is used");
     age=c.age;
     Name=c.Name;
    }
    public String toString()
    {
        return "(" + Name +" "+ age +")";
    }
}

public class Rough {
    public static void main(String[] args) {
        System.out.println("This template is for rough only.");
        Pecifist pepper= new Pecifist("Farhaan",20);
        Pecifist pepper1= new Pecifist(pepper);
        Pecifist pepper2=pepper;
        System.out.println(pepper);


    }

}
//class Complex {
//
//    // Class data members
//    private double re, im;
//
//    // Constructor 1
//    // Parameterized constructor
//    public Complex(double re, double im)
//    {
//
//        // this keyword refers to current instance itself
//        this.re = re;
//        this.im = im;
//    }
//
//    // Constructor 2
//    // Copy constructor
//    Complex(Complex c)
//    {
//
//        System.out.println("Copy constructor called");
//
//        re = c.re;
//        im = c.im;
//    }
//
//    // Overriding the toString() of Object class
//    @Override public String toString()
//    {
//
//        return "(" + re + " + " + im + ")";
//    }
//}
//
//// Class 2
//// Main class
//public class Rough {
//
//    // Main driver method
//    public static void main(String[] args)
//    {
//
//        // Creating object of above class
//        Complex c1 = new Complex(10, 15);
//
//        // Following involves a copy constructor call
//        Complex c2 = new Complex(c1);
//
//        // Note: Following doesn't involve a copy
//        // constructor call
//        // as non-primitive variables are just references.
//        Complex c3 = c2;
//
//        // toString() of c2 is called here
//        System.out.println(c2);
//    }
//}