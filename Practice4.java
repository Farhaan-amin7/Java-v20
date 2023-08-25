import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
//        int s=5;
//        for (int i=5;i>0;i--)
//        {
//            for (int j=0;j<i;j++)
//            {
//                System.out.print(" * ");
//            }
//            System.out.print("\n");
//        }
        /* I have to Print even numbers up to n terms*/
//         int sum=0,i=0;
          Scanner sc=new Scanner(System.in);
//        System.out.println("Enter up to how many terms you want the sum of even numbers :-");
//        int n=sc.nextInt();
//        while(i<=n)
//        {
//            sum+=(2*i);
//            i++;
//
//        }
//        System.out.println("The sum of first 10 numbers is "+sum);
        /*This is for printing Table of 10 in reverse order.*/
        int n=8,sum=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println("8 * "+i +" = "+8*i);
            sum+=8*i;


        }
        System.out.println(sum);
//        System.out.println("This should not be executed after continue statement");
        /*This is for obtaining factorial of a given number.
        * Notes:-The initial value of the factorial should always be 1 and the value of i should also be always Greater than zero*/
//        int fact=1,n;
//        System.out.println("Enter the number of which you want the factorial of :-");
//        n=sc.nextInt();
//        for (int i=1;i<=n;i++)
//        {
//            fact*=i;
//        }
//        System.out.println("The factorial of the given number " + n+" is  " + fact);


    }

}
