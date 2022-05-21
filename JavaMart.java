public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       if( wallet >= toyCar)
       {
           System.out.println("Sure! pay for the car");
       }
       else{
           System.out.println("Sorry, I only have "+ wallet + "left");
       }
        //if you have enough money
            //       print: Sure!
            //       pay for the toy car 

        //else:  Sorry, I only have <wallet> left.

        wallet = wallet - 5.99;
        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        if(wallet > 95.99)
        {
        System.out.println("SURE!");
        }
        else 
        {
            System.out.println("Sorry, I have 94.01 left");//if you have enough money
            //       print: Sure!
            //       pay for the nike shoes 

        //else: Sorry, I only have <wallet> left.

    }
    }}