import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Dealership{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Welcome to the java dealersip");
        System.out.println(" Select option 'a' to buy a car");
        System.out.println(" Select option 'b' to sell a car");
        String option = scan.nextLine();
        switch(option)
        {
            case "a": System.out.println(" What is your budget? "); 
            int budget = scan.nextInt();
            if(budget >= 10000)
            {
                System.out.println("Great! A Nissan Altima is available");
                System.out.println("\nDo you have insurane? Write 'yes' or 'no'");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\n Do you have a drivers liense? Write 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditscore = scan.nextInt();
                if ( insurance.equals("yes") && license.equals("yes") && creditscore > 660)
                {
                    System.out.println("SOLD! Pleasure doing business with you");
                }
                else{
                    System.out.println("We are sorry you are not eligible");
                }
            }
            else{
                System.out.println("We don't sell cars under $10,000. Sorry!");
            }
            break;
            case "b" : System.out.println("\nWhat is you car valued at?" );
            int value = scan.nextInt();
            System.out.println("\nWhat is your selling price?");
            int price = scan.nextInt();
            if ( value > price && price < 30000)
            {
                System.out.println("\nWe will buy your car. Pleasure doing business with you!");
            }
            else{
                System.out.println("/nSorry, we're not interested");
            }
             break;
            default : System.out.println("Invalid Option");


        } scan.close();
    }
} 