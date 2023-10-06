
import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        boolean flag = true;
        int choice = 0, chosen2 = 0;
        int max = 2, min = 0;
        int n = 1, pointcomp = 0, pointplayer = 0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("**Welcome to Rock Paper Scissor Game, Please enjoy.**");

        System.out.println("You have to choose your Option and Both You and Computer get 3 turns each\n");
        while (n <= 3 && flag) {
            System.out.println("Choose :-\n1.For Rock.\n2.For Paper\n3.For Scissor");
            choice = sc.nextInt();
            System.out.println("You chose " + choice);
            System.out.println(" ");
            chosen2 = random.nextInt(3) + 1;
            System.out.println("Computer chose " + chosen2);
            System.out.println(" ");
            if (choice == 1) {
                System.out.println("You chose Rocks");
            } else if (choice == 2) {
                System.out.println("You chose Paper");
            } else if (choice == 3) {
                System.out.println("You chose Scissor");
            } else if (choice != 1 || choice != 2 || choice!= 3){
                System.out.println("You chose wrong input, Please enter valid input");
                flag = false;
                break;
            }
            if(choice ==1 && chosen2==3 || choice ==2 && chosen2==1 || choice==3 && chosen2==2)
            {
                System.out.println("You Won. You got it!!!");
                pointplayer++;
            }
            else if (chosen2==1 && choice==3 || chosen2==2 && choice ==1 ||chosen2==3 && choice==2 )
            {
                System.out.println("Computer Won. Computer got it!!!");
                pointcomp++;
            }
             else if (choice == chosen2)
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
            System.out.println("Computer have WON the Game!!!, better luck next time.");
        }
        else if(pointplayer>pointcomp) {
            System.out.println("Congratulations, You have won!!!");
        }
        else System.out.println("Its a Draw, You both should try again.");
    }


    }