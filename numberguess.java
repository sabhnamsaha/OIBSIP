import java.util.Scanner;
import java.util.Random;
public class numberguess
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Random ran=new Random();
        int k=5;
        int flag=0;
        int i;
        System.out.println("Welcome to Guess the Number game!");
        System.out.println("Let's Start!");
        System.out.println("It's Mr.Computer's turn to generate a number");
        int num=ran.nextInt(100);
        System.out.println("You have 5 chances to guess the number!");
        for(i=1;i<=20;i++)
        {
            if(k>0)
            {
            System.out.println("Enter the number you think it is-");
            int guess=sc.nextInt();
            System.out.println();
            if(guess==num)
            {
                flag=1;
                System.out.println("Congratulations! It matched and YOU WON !");
                System.exit(0);
            }
            else
            {
            System.out.println("It didn't match!");
            if(guess<num)
            System.out.println("The number you guessed is lower than the number generated by Mr.Computer.");
            if(guess>num)
            System.out.println("The number you guessed is higher than the number generated by Mr.Computer.");
            k--;
            System.out.println("You have "+k+" chances left");
            System.out.println("Try again!");
            }
        }
            else if(k<=0)
            {
            System.out.println("Dear player, your 5 chances to guess the game is over!");
            System.out.println("Do you want to play again?");
            System.out.println("If yes press 1 else press 0 to exit.");
            int attempt=sc.nextInt();
            if(attempt==1)
            {
            k=5;
            continue;
            }
            else
                {
                System.exit(0);
                }
            }
        }
        if(flag==0 && i>=20)
        {
            System.out.println("Sorry your maximum attempts exceeded!");
                System.out.println("Better luck next time!");
        }
    }
}


