import java.util.InputMismatchException;
import java.util.Scanner;

public class Mismatch_exception {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=1;
        marks[1]=2;
        marks[2]=3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the index you want to achieve");
        int id=sc.nextInt();
        try {
            System.out.println(marks[id]/2);
        }
        catch (ArithmeticException r)
        {
            System.out.println("The exception occuring is ");
            System.out.println(r);

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is an issue with your code  please fix it");
            System.out.println(e);
        }
        catch (InputMismatchException f)
        {
            System.out.println("Enter valid value");
            System.out.println(f);
        }
    }
}