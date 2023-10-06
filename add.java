

import java.util.*;
public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers you want to add\n");
        int a= sc.nextInt();
        System.out.println("Enter another number \n");
        int b= sc.nextInt();
        System.out.println("Enter another number \n");
        int c= sc.nextInt();
        int d= a+b+c;
        int e = a*b;
        System.out.println("Total ="+d);
        System.out.println("The multiplication of the two numbers is "+e);

    }
}