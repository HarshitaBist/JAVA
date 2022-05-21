import java.util.Scanner;
public class DiceJack {
    public static void main(String[] args) {
        /**
         * TASKS:
         * 1.roll the dice.
         * 2.Check if the user won.
         * The user wins if:
         * 1. The sum of dice rolls is smaller than the sum of numbers you chose
         * 2. AND the difference between the two numbers is less than three
         */
        Scanner scan = new Scanner(System.in);
        
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
      
        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println(roll1);
        
        System.out.println(roll2);
        
        System.out.println(roll3);
      if(num1 < 1 || num2 < 1 || num3 < 1)
      {
          System.out.println("Numbers cannot be less than 1.Shutting game down :(");
          System.exit(0);
      }
      if(num1 > 6  || num2 > 6 || num3 > 6)
      {
          System.out.println("Numbers cannot be higher than 6. Shutting the game down :(");
          System.exit(0);
      }
      int sumOfNumbers = num1 + num2 + num3;
      int sumOfDiceRolls = roll1 + roll2 + roll3;
      System.out.println("Dice sum = " + sumOfDiceRolls + ". Number sum = " + sumOfNumbers);
      if(checkWin( sumOfDiceRolls , sumOfNumbers))
      {
          System.out.println("Congrats you win!");
      }
      else
      {
          System.out.println("Sorry you lose:(");
      }
        scan.close();
        
       

    }
    public static int rollDice()
    {
        double randomNumber = Math.random() * 6; //math.random (0-less than 1 that is 0.99999) hence we will get 5 as the maximim problem and dice doesn't have 0 hence we need to add 1 as the lowest possible number.
        randomNumber +=1; // lowest possible value will be 1 and highest will be 6.
        return(int)randomNumber ; // Type Casting
    }
    public static boolean checkWin( int sumOfDiceRolls, int sumOfNumbers)
    {
        return (sumOfDiceRolls < sumOfNumbers && sumOfNumbers - sumOfDiceRolls < 3);
    
    }
}
