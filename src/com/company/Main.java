package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int x = 1000;
        int noguess = 0;
        int count = 0;
        int guess;

        System.out.println("Guess No between 1 and 1000");


        while (noguess != x){
            noguess = input.nextInt();
        count++;


            if (noguess < x)
            {
                System.out.println("Guess is less than 1000");
                System.out.println("Do you want to write again? (Y/N)");

            }
            else if (noguess > x)

            {
                System.out.println("Guess is more than 1000");
                System.out.println("Do you want to write again? (Y/N)");
            }
            else if (noguess == x)
            {
                System.out.println("You Won!");
            }

        }
    }
}
