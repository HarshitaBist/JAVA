import javax.lang.model.util.ElementScanner6;

public class WorkSchedule {
    public static void main(String[] args) {
        int day = 3;  
        boolean holiday = false;
         if(holiday)
         {
             System.out.println("woohoo, no work!");
         }
         else if(day == 6 || day == 7)
        {
            System.out.println("it's the weekend, no work!");
        }
        else
        {
            System.out.println("wake up at 7 :(");
        }
        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        // otherwise, print: "Wake up at 7:00 :( ";
        }

    }
