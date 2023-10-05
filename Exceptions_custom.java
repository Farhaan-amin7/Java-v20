import java.util.Scanner;

class Myexception extends Exception{

    public String getMessage()
    {
        return "Please enter a number which is smaller than 9";
    }
    public String toString()
    {
        return "I am to string";
    }

//    @Override
//    public void printStackTrace() {
//        return ;
//    }
}
public class Exceptions_custom {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter any number you want to compare:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>9)
        {
            try{
                throw new Myexception();
//                throw new ArithmeticException("This number is greater than 9 please enter the number which is smaller than 9 ");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                e.printStackTrace();
                System.out.println("End of program");
            }
        }
        else {
            System.out.println("This is being printed in else block");
        }





    }
}