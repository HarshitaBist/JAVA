public class BuiltInFunctions
{
    public static void main(String[] args) {
        System.out.println("Hello java");

        double sine = Math.sin(1.2);
        System.out.println("The sin of 1.2 is: "+ sine); 

        double power = Math.pow(2,5);
        System.out.println("2 to the power 5 is " + power );
        
        double random = Math.random() * 10;//returns a double random returns a random decimal between 0-1
        System.out.println("The random value is " + random);
    }
}