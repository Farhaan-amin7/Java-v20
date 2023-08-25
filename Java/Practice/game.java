package Java.Practice;

import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        int choise = 0, chosen2 = 0;
        int max = 2, min = 0;
        int n = 1, pointcomp = 0, pointplayer = 0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("**Welcome to Rock Paper Scissor Game, Please enjoy.**");
        System.out.println("You have to choose your Option and Both You and Computer get 3 turns each\n");
        while (n <= 3) {
            System.out.println("Choose 1.For Rock.\n2.For Paper\n3.For Scissor");
            choise = sc.nextInt();
            System.out.println("You chose " + choise);
            chosen2 = random.nextInt(3) + 1;
            System.out.println("Computer chose " + chosen2);
            if (choise == 1) {
                System.out.println("You chose Rocks");
            } else if (choise == 2) {
                System.out.println("You chose Paper");
            } else if (choise == 3) {
                System.out.println("You chose Scissor");
            } else {
                System.out.println("You chose wrong input");
            }
            if(choise ==1 && chosen2==3 || choise ==2 && chosen2==1 || choise==3 && chosen2==2)
            {
                System.out.println("You got it!!!");
                pointplayer++;
            }
            else if (chosen2==1 && choise==3 || chosen2==2 && choise ==1 ||chosen2==3 && choise==2 )
            {
                System.out.println("Computer got it!!!");
                pointcomp++;
            }
             else if (choise == chosen2)
             {
                System.out.println("Its a draw, You both get a point");
                pointcomp++;
                pointplayer++;
            }
            System.out.println("Your score is "+ pointplayer);
            System.out.println("Computers  score is "+ pointcomp);
            n++;
        }


        if (pointcomp > pointplayer) {
            System.out.println("Computer have WON!!!");
        }
        else if(pointplayer>pointcomp) {
            System.out.println("Congratulations, You have won!!!");
        }
        else System.out.println("Its a Draw, You both should try again.");
    }


    }




