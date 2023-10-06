/*
Player computer
player
points
who won
-- what is the outcome of the input of the players.
--what did the computer and the player chose
-- is it a draw?
-- show the points after each play
*/

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {

    public void WhatPlayersChose(int Choice, String WhichPlayer) {
        if (Choice == 1) {
            System.out.println(WhichPlayer + " chose  Rocks ");
        } else if (Choice == 2) {
            System.out.println(WhichPlayer + " chose Paper");
        } else if (Choice == 3) {
            System.out.println(WhichPlayer + " chose Scissor");
        } else {
            System.out.println(WhichPlayer + " Entered Wrong choice Please enter ");
        }

    }
    public void ShowPoints(int Pp, int Cp)
    {
        System.out.println("You have "+ Pp + " points");
        System.out.println("Compute have "+ Cp + " points");

    }
    public void WhoHasMorePoints(int Pp, int Cp)
    {
        if (Pp>Cp)
        {
            System.out.println("Congratulations!!! You have Won the game.");
        }
        else if (Cp>Pp)
        {
            System.out.println("Computer has won the game . Better luck next time.");
        }
        else
        {
            System.out.println("Its a draw, Go one more time , GOOD Luck.");

        }

    }

    public static void main(String[] args) {//Main starting

        int PlayerReal = 0;
        int ComputerPlayer = 0;
        int PlayerRealPoints=0;
        int ComputerPlayerPoints=0;
        int n = 1;
        int PlayerChoice;
        int ComputerChoice;

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        System.out.println("WELCOME ! To the rock paper scissors game , Please Enjoy");

        System.out.println("NOTE :- *Each player gets three turns, who ever Scores more points Wins the game !* ");

        Rock_Paper_Scissor_Game NewGame = new Rock_Paper_Scissor_Game();

        while (n <= 3)
        {
            System.out.println("Choose \n1.For Rocks.\n2.For Paper.\n3.For Scissors\n\n");

            PlayerChoice = sc.nextInt();

//            Rock_Paper_Scissor_Game NewGame = new Rock_Paper_Scissor_Game();

            NewGame.WhatPlayersChose(PlayerChoice, "You ");

            ComputerChoice = random.nextInt(3) + 1;

            System.out.println("Computer choose  " + ComputerChoice);

            NewGame.WhatPlayersChose(ComputerChoice, "Computer");

            if (PlayerChoice == 1 && ComputerChoice == 3 || PlayerChoice == 2 && ComputerChoice == 1 || PlayerChoice == 3 && ComputerChoice == 2) {
                System.out.println("You Won this round!!!\n");
                PlayerRealPoints++;

            } else if (PlayerChoice == ComputerChoice) {

                System.out.println("You both chose the same Option, It's a draw!!!. You both get no points.");
            } else {

                System.out.println("Computer Won this round\n");
                ComputerPlayerPoints++;

            }
            NewGame.ShowPoints(PlayerRealPoints,ComputerPlayerPoints);

            n++;

        }

        NewGame.WhoHasMorePoints(PlayerRealPoints, ComputerPlayerPoints);




    }

}