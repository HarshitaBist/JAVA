public class LogicalOperators{
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;
        String language = "Java";
        if( chemistryGrade > 75 || englishGrade > 75 || language.equals("java")) {
            System.out.println("Congratulations, you got the scholarship!");
        }   
        else{
            System.out.println("We're sorry you didnt get the scholarship.");
        }
        int credits = 56;
        double GPA = 3.2;
        if(credits >= 40 && GPA >= 2.0) //&& operator needs to have both the conditions to be true
        {
            System.out.println("You earned your diploma!");
        }
        else{
            System.out.println("Sorry, you need atleast 40 credits and a minimum GPA 2.0  ");
        }
}}