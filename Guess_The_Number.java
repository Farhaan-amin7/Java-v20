/*

-- Make a class Game which allows the user to play the game once
-- The output should tell us is the number Greater or lesser number than the Random number.
-- Count the number of guesses a player made.

-- should have a constructor to generate a random number      ->[DONE]
-- takeUserInput() to take the input of the user    ->[DONE]
-- IsCorrectNumber() to detect whether the number entered by the user is correct or not     ->[DONE]
-- Use the property such as NoOfGuesses (INT) to get this task done.   ->[DONE]



 */

import java.util.Random;
import java.util.Scanner;

class game7{
    int RandomNumber;
    public game7 (int x)
    {
        Random random= new Random();
        RandomNumber=random.nextInt(x);

    }

    public void IsNumberGreaterOrLesser(int number)
    {
       if (number > RandomNumber)
        {
            System.out.println("The entered number is greater than the Random number.");
        }
        else if (number<RandomNumber) {
            System.out.println("The entered number is smaller than the Random number.");
        }



    }
    public void isCorrectNumber(int number1)
    {
        if(number1== RandomNumber)
        {
            System.out.println("CONGRATULATIONS!!! You Guessed the correct number.");
        }

    }


}

public class Guess_The_Number {
    public static void main(String[] args) {
        boolean flag =true;
        int NoOfGuesses=0;
        int UserInput=0;
        Scanner sc = new Scanner(System.in);
        game7 Gamer = new game7(50);

        while(flag) {
            System.out.println("Please enter your guess number(0-50)");

            UserInput = sc.nextInt();

            NoOfGuesses++;

            if (UserInput == Gamer.RandomNumber)
         {
             flag =false;
         }
         else {
             Gamer.IsNumberGreaterOrLesser(UserInput);

                System.out.println(" ");

             Gamer.isCorrectNumber(UserInput);
         }

        }
        System.out.println("It took you " +NoOfGuesses + " to guess the correct number");

        System.out.println("GAME ENDED!");




    }
}