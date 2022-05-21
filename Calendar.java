import javax.xml.transform.Source;
public class Calendar{
    public static void main(String[] args) {
        String day = "friday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        switch(day)
        {
            case "monday" : System.out.println("Sorry, I have to stay at work late."); break;
            case "tuesday": System.out.println("It looks like I have meetings all day.");break;
            case "wednesday" : System.out.println("I have a dentist appointment. Some other time!");break;
            case "thursday" : System.out.println("Sorry, thursday is date night");break;
            case "friday": System.out.println("I'm free");break;
            case "saturday" : System.out.println("I'm free");break;
            case "sunday" : System.out.println("I'm free");break;
            default : System.out.println("thats not a day you dumbfuck");break;
        }
        //Check calendar here:

            //  "Monday": print ("Sorry, I have to stay at work late."); 
            //  "Tuesday": print ("It looks like I have meetings all day."); 
            //  "Wednesday": print ("I have a dentist appointment. Some other time!"); 
            //  "Thursday": print ("Sorry, thursday is date night!"); 
            //  "Friday": print ("I'm free!!"); 
            //  "Saturday": print ("I'm free!!"); 
            //  "Sunday": print ("I'm free!!"); 
            //  "otherwise": print ("that's not a day."); 

        
        

    }
}