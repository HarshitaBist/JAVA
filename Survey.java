import java.util.Scanner;
public class Survey {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scan = new Scanner(System.in); //System input
        //nextLine() waits for the user to enter a string
        System.out.println("Welcome. Thank you for taking the survey");
        int counter = 0;
        System.out.println(" \n What is your name?");
        String name = scan.nextLine();
        counter ++;
        System.out.println("\n How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;
        System.out.println("\n How much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter ++;
        System.out.println("\n How many times a week do you buy coffee?");
        int coffeeAmt = scan.nextInt();
        counter++;
        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmt = scan.nextInt();
        counter++;
        System.out.println("\n" + " Thank you " + name + " for answering all " + counter + " questions ");
        System.out.println("Your fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee expenses");
        System.out.println("Weekly, you spend $" + (coffeeAmt*coffeePrice) + " on coffee");
        System.out.println("Weekly, you spend $" + (foodAmt*foodPrice)+ " on food");
        scan.close();
    }
    
}
