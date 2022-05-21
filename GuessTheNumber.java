import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("I chose a number between 1-6. Try to guess it: ");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        while(guess != number)
        {
            System.out.println("Guess again: ");
            guess = scan.nextInt();
        }
        System.out.println("You got it!!");
        scan.close();
    }
}
