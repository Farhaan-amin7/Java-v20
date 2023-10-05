package Java.Practice;

public class Varargs {
    static int IamFree(int ...x)
    {
        float avg=0f;
        int sum=0;
        for (int fa:x) {
            sum+=fa;
//            System.out.println(fa);
        }
        System.out.println("The addition of all these terms is " + sum);
        avg=sum/ x.length;
        System.out.printf("The average of the terms is %4.1f ", avg);
        return 0;
    }
    public static void main(String[] args) {
        int v;
        IamFree(10,10,10,10,10,1000);

    }
}
