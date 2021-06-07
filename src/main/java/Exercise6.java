/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brooke Fuller
 */
import java.util.Scanner;
import java.lang.*;
import java.time.*;



import static java.lang.System.*;

public class Exercise6
{
    public static void main(String[] args)
    {
        out.println("What is your current age? ");
        Scanner input = new Scanner(in);
        String age = input.nextLine();
        out.println("At what age would you like to retire? ");
        Scanner input2 = new Scanner(in);
        String retirementAge = input2.nextLine();

        try
        {
            int x = Integer.parseInt(age);
            int y = Integer.parseInt(retirementAge);
            int yearsTill = y - x;
            int currentYear = Year.now().getValue();
            int retireYear = yearsTill + currentYear;

            if (yearsTill > 0 && x > 0)
            {
                System.out.println("You have " + yearsTill + " years left until you can retire. It's " + Year.now() + ", so you can retire in " + retireYear + ".");
            }
            if (yearsTill <= 0 && x > 0)
            {
                System.out.println("Congratulations! You are already retired!");
            }
            if(x < 0)
            {
                System.out.println("Oh no, it seems you have not been born yet. Try again later.");
            }
        }
        catch(Exception e)
        {
            System.out.println("Please enter valid numbers. Thank you.");
        }


    }
}