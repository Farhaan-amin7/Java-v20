package Java.Practice;

import java.util.Scanner;
public class arrays1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] marks=new int[5];
        System.out.println("Enter the elements of the array:-");
        for (int i=0;i< marks.length;i++)
        {
            marks[i]=sc.nextInt();
        }
//        for (int i=0;i< marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }
//        Now by using for-each loop.
        for (int what/*Dosent matter what we write instead of element it will accept and print.*/:marks) {
            System.out.println(what);
        }
    }
}
