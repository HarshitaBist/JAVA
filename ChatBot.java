
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\n Hello. What is your name?");
        //Pick up user's name and store it. 
        String name = scan.nextLine();

                           
        //add new a line before asking next question. 
        System.out.println("\n Hi" +  name + " I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
         String home = scan.nextLine();               

        //add new a line before asking next question.
        System.out.println("/n I hear it's beautiful at" + home + " I'm from a place called Oracle");
        System.out.println("/n How old are you?");
        //Pick up age and store it.
        int age = scan.nextInt();
        scan.nextLine();

        //add new a line before asking next question.
        System.out.println("\nSo you're" + age + "  , cool! I'm 400 years old.");
        System.out.println("\nThis means I'm  " + (age/400) +"  times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        String lan = scan.nextLine();


        //add new a line here.
        System.out.println(lan + ", that's great! Nice chatting with you" + name+ ". I have to log off now. See ya!");
        
        scan.close();

        
    }
}

