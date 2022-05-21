public class Scope {
    static int dogs = 5;
    public static void main(String[] args) {
        System.out.println(dogs);
        // int apples = 5; apples was outside the scope of someFucntion hence it couldn't print it.
        someFunction();
    }
    public static void someFunction()
    {
        System.out.println(dogs);
 
    }
}
