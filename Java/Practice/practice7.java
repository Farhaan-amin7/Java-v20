package Java.Practice;

import java.util.Scanner;
public class practice7 {
    static void PrintReverseStar()
    {
        for (int i=5;i>=0;i--)
        {
            for (int n=0;n<=i;n++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
//    static int NaturalNumbersadd(int n) {
//        int sum = 0;
//            if (n == 0 || n == 1) {
//                return 1;
//            }
//               return n + NaturalNumbersadd(n - 1);//Forgot to recall the Method in which we described the logic.
//        }



//    static void PrintStar()
//    {
//        for(int i=0;i<=5;i++)
//        {
//            for (int h=0;h<i;h++) {
//                System.out.print(" * ");
//
//            }
//            System.out.println(" ");
//        }
//    }
    public static void main(String[] args) {
        PrintReverseStar();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("The the last term up to you want the addition");
//        int n=sc.nextInt();
//
//        n=NaturalNumbersadd(n);
//        System.out.println("The addition of the Natural numbers is  " +n);
////        PrintStar();

    }
}
