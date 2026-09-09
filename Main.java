import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        MealPlan maroon = new MealPlan("Maroon", 2090);
        MealPlan maroonPlus = new MealPlan("Maroon Plus", 2646);

        System.out.println("Welcome to VT's dining plan helper");

        System.out.println("1. Dining Hall");
        System.out.println("2. Multiple food options");

        System.out.println("Select an option: ");
        int option = input.nextInt();

        if(option == 1)
        {
            System.out.println("Select Unlimited Plan");
        }
        else if(option == 2)
        {
            System.out.println("Your options are Maroon and Maroon Plus");
            System.out.print("Enter Approximate Daily Limit: ");

            double dailyLimit = input.nextDouble();
            double approximateSemesterSpending = dailyLimit * 120; //120 is the approx number of days a student will be on campus including holidays and weekends//

            if(approximateSemesterSpending <= maroon.getBalance())
            {
                System.out.println("Choose: "+ maroon.getName());
            }
            else if(approximateSemesterSpending <= maroonPlus.getBalance())
            {
                System.out.println("Choose: " + maroonPlus.getName());
            }
            else
            {
                System.out.println("Choose between the Unlimited or the Unlimited Plus as both offer the same thing with extra dining dollars");
            }
        }
        else
        {
            System.out.println("Invalid: select one of the above");
        }
    }
}