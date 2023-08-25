package Java.Practice;

class Animal {
    int What;
    String YOu;

    public Animal() {
        System.out.println("I am the constructor of Animal class with no parameters");
    }

    public Animal(int c) {
        System.out.println("I am the constructor of Animal class with one parameter.");
    }
}
    class Cat extends Animal {
        int meow;

        public Cat() {
            System.out.println("This constructor holds the no parameter of the class Cat.");
        }

        public Cat(int x, int y) {
            super(10);
            System.out.println("This constructor holds two parameters.");
        }
    }
    class Human extends Cat {
    int Nose;
    public Human()
    {
        System.out.println("This is Human speaking with 0 parameters");
    }
    public Human(int m1,int mm,int mj)
    {
        super(10,20);
        System.out.println("This Human has three Noses as Parameters.");
    }
}



public class Practice12 {

    public static void main(String[] args) {
        Cat Lovely = new Cat(10,20);
        Human Abid =new Human(10,20,30);

    }
}
