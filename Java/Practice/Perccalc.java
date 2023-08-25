package Java.Practice;

import java.util.*;
public class Perccalc {
    public static void main(String[] args) {
        System.out.println("Enter the marks of the students subject");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the English Subject:");
        float a=sc.nextFloat();
        System.out.println("Enter the marks of the Maths Subject:");
        float b= sc.nextFloat();
        System.out.println("Enter the marks of the Computer Subject:");
        float c = sc.nextFloat();
        System.out.println("Enter the marks of the History Subject:");
        float d = sc.nextFloat();
        System.out.println("Enter the marks of the Urdu Subject");
        float e = sc.nextFloat();
        float FinalMarks= a+b+c+d+e;
        float TotalNoOfMarks=500;
        float Percentage=(FinalMarks/TotalNoOfMarks)*100;
        System.out.println("The percentage of this student is "+Percentage);

    }
}
