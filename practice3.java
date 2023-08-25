import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float marks,sub1,sub2,sub3;
        float TotalMarks=0;
        System.out.println("Enter the marks of the first subject:");
        sub1= sc.nextFloat();
        System.out.println("Enter the marks of the second subject:");
        sub2=sc.nextFloat();
        System.out.println("Enter the marks of the third subject:");
        sub3=sc.nextFloat();
        marks=sub1+sub2+sub3;
        TotalMarks=(marks/300)*100;
        if (marks<99 && sub1<33 && sub2<33 && sub3<33)
        {
            System.out.println("Sorry, You have failed your exam. Better luck next time");
        }
        else
        {
            System.out.println("Congratulations you have successfully passed the exam with a whooping "+TotalMarks+" percentile");
        }


    }
}
