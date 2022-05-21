public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 0 ; i < 19 ; i++)
        {
            if(i%3 == 0){
            System.out.println(i + "  FIZZ");}
            else if (i%5 == 0)
            {
                System.out.println(i + "  BUZZ");
            }
            else if( i%3 == 0 && i%5 == 0)
{
    System.out.println(i + "  FIZZBUZZ");
}
            
        }
    }
}
