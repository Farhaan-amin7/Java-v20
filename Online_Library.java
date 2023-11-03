import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

//Exercise 4;
/*

Implement a library using the library class in java

methods-> IssueBook,ReturnBook,AddBook,ShowTheAvailableBook
properties -> Array to store the available books and Array to store the issued books.



 */
class Library{
    int  NumberOfBooksAvailable = 0;
    String [] Book;
    String IssuedBooks1;
    String [ ] IssuedBooks ;

    String [ ] AvailableBooks;
    int AvailableBooks1;
    Library(String Book)
    {
        this.Book[NumberOfBooksAvailable]= Book;
    }

    public void IssueBook()
    {
        int UserInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Which book do you want to issue :");
        System.out.println("Enter 1. For Rich dad poor dad \n" + " Enter 2. For The power of your subconscious mind\n" +
                "Enter 3. For Money effect\n" + "Enter 4. For Psychology of money");
        UserInput = sc.nextInt();
        if (UserInput == 1 )
        {
            IssuedBooks1= AvailableBooks[0];
            System.out.println("Book issued successfully -ThankYou for issuing this book.Please make sure to return it on time.");

        } else if (UserInput == 2) {
            IssuedBooks1= AvailableBooks[1];
            System.out.println("Book issued successfully -ThankYou for issuing this book. Please make sure to return it on time.");

        }else if (UserInput == 3) {

            IssuedBooks1= AvailableBooks[2];
            System.out.println("Book issued successfully -ThankYou for issuing this book. Please make sure to return it on time.");

        }else if (UserInput == 4) {
            IssuedBooks1= AvailableBooks[3];
            System.out.println(" Book issued successfully -ThankYou for issuing this book. Please make sure to return it on time.");
        }
        else {
            System.out.println("Wrong Input entered.");
        }
    }
    public void AddBook()
    {
        System.out.println("Name the book you want to add.");
        Scanner sc = new Scanner(System.in);
        String newBook;
        newBook= sc.nextLine();

        System.out.println("Thank you for storing " + newBook);

    }
    public void ShowTheAvailableBook()
    {

        System.out.println("The available books are :");
        Scanner sc = new Scanner(System.in);

        AvailableBooks[0]= "Rich dad poor dad";
        AvailableBooks[1]= "The power of your subconscious mind";
        AvailableBooks[2]= "Money effect";
        AvailableBooks[3]= "Psychology of money";

        for (String element:AvailableBooks)
             {
                 System.out.println(element);
             }
        AvailableBooks1 = AvailableBooks.length;

        System.out.println("There are " + AvailableBooks1 +" Books available.");


    }
    public void ReturnBook()
    {
        Scanner sc = new Scanner(System.in);

        int ReturnIssuedBook;
        System.out.println("Which book do you want to return :");

        System.out.println("Enter 1. For Rich dad poor dad \n" + " Enter 2. For The power of your subconscious mind\n" +
                "Enter 3. For Money effect\n" + "Enter 4. For Psychology of money");

        ReturnIssuedBook = sc.nextInt();
        if (ReturnIssuedBook == 1 )
        {

            System.out.println("ThankYou for returning this book. Please visit again.");
        } else if (ReturnIssuedBook == 2) {

            System.out.println("ThankYou for returning this book. Please visit again.");

        }else if (ReturnIssuedBook == 3) {


            System.out.println("ThankYou for returning this book. Please visit again.");

        }else if (ReturnIssuedBook == 4) {

            System.out.println("ThankYou for returning this book. Please visit again.");
        }
        else {
            System.out.println("Wrong Input entered.");
        }

    }
}
public class Online_Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag= true;

        Library library = new Library("C++");
        while(flag) {
            System.out.println("What operation do you want to do :");
            System.out.println("Enter 1 to checkout available books");
            System.out.println("Enter 2 to Issue books");
            System.out.println("Enter 3 to Add books");
            System.out.println("Enter 4 to Return books");
            System.out.println("Press 0 to quit");
            int ch;
            ch = sc.nextInt();
            if (ch == 1) {
                library.ShowTheAvailableBook();

            } else if (ch == 2) {
                library.IssueBook();

            } else if (ch == 3) {
                library.AddBook();
            }
            else if (ch == 4) {
                library.ReturnBook();
            }
            else if (ch==0) {
                flag = false;
                System.out.println("Exiting the program");
            }
            else {
                System.out.println("Wrong input please try again.");
            }
        }



    }
}