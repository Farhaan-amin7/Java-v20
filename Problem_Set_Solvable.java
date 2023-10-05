import javax.swing.*;
import java.util.Scanner;
class MaxRetriesException extends Exception{
    public String toString()
    {
        return "Its a wrong input";
    }
}

public class Problem_Set_Solvable {




//    public static void whatever(){
//
//
//        try{
//            int k= 0;
//            int l=4;
//            int u=l/k;
//        }catch (ArithmeticException e)
//        {
//            System.out.println("Hahahahahhah");
//        }
//        catch (IllegalArgumentException t)
//        {
//            System.out.println("Hafta Hafta");
//        }
//    }
    public static void main(String[] args) {
//        whatever();
        boolean flag=true;
        int [] itsarray =new int[3];
        System.out.println("Enter the values of the array");
        for(int i=0;i<3;i++)
        {
            Scanner sc  = new Scanner(System.in);
            itsarray[i]= sc.nextInt();
        }

        Scanner sc  = new Scanner(System.in);
        int p=0;
        System.out.println("you have only 3 tries to get the correct input");
        while( flag && p<5)
        {

                try {

                    System.out.println("Enter the index you want to get");
                    int id = sc.nextInt();
                    for(int i=0;i<3;i++) {
                        if (itsarray[id] != itsarray[i]) {
                            try {
                                throw new MaxRetriesException();
                            } catch (MaxRetriesException e) {
                                p++;
                                System.out.println(e.toString());
                            }
                        }

                    }
                    System.out.println(itsarray[id]);
                    }
                catch (ArrayIndexOutOfBoundsException j)
                {
                    System.out.println(j);
                }
//        System.out.println("Program has ended");

        }






    }
}