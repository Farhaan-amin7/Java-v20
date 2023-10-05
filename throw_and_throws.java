import java.util.Scanner;

class NegativeSizeException extends Exception{

    public String toString()
    {
        return "Please enter the values which are Greater than 0";
    }
    public String getMessage()
    {
        return "Please enter the values which are Greater than 0";
    }

}

public class throw_and_throws{
    public static int area ()throws NegativeSizeException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values of the rectangle");
       int l=sc.nextInt();
        int h=sc.nextInt();
        if (l < 0 || h<0) {
                throw new NegativeSizeException();
            }
        return 2 * (l+h);

    }


    public  static void  main (String[] args) throws NegativeSizeException {
        System.out.println(area());

    }

}