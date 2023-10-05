import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 22;
        arr[2] = 33;
        boolean flag = true;

        while (flag) {
            System.out.println("enter which index of the array you want to attain");
            Scanner sc = new Scanner(System.in);
            int ind = sc.nextInt();
            try {

                System.out.println("This is the level one of this try ");
                System.out.println("The value at the index is " + arr[ind]);
                flag = false;
            }
//              catch (InputMismatchException ex) {
//                  System.out.println("Sorry this index does not exist.");
//                  System.out.println( ex);

//              }
            catch (InputMismatchException ex) {
                System.out.println("The enterd value has the following exception");
                System.out.println(ex);
            }


            System.out.println("This is outside the try ");
        }
    }
}