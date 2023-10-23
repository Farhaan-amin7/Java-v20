

import java.util.*;

public class add {
    public void drunk(int a )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount you want to add to the bank and the amount that has been added to your account :");
        int d = sc.nextInt();
        System.out.println("The amount that has been added to his account is " + d);
        int e = sc.nextInt();
        System.out.println("The money that you want to add to your account is " + e);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers you want to add\n");
        int a= sc.nextInt();
        System.out.println("Enter another number \n");
        int b= sc.nextInt();
        System.out.println("Enter another number \n");
        int c= sc.nextInt();
        System.out.println("The sum of the numbers entered by the user is :"+ (a + b));// I need to put the variables into the small brackets

        System.out.println(a+b);
//        int d= a+b+c;
        int e = a*b;
//        System.out.println("Total ="+d);
        System.out.println("The multiplication of the two numbers is "+e);
        add whatAdd = new add();
        whatAdd.drunk(5000);

    }
}