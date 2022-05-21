import java.util.Scanner; 
public class Championship {
    public static void main(String[] args) {

            //gryffindor points
           //ravenclaw points
        
        Scanner scan = new Scanner(System.in);
        System.out.println("GRYFFINDOR SCORED");
        int gryffindor = scan.nextInt();
        System.out.println("RAVENCLAW SCORED");
        int ravenclaw = scan.nextInt();
        int pointMargin = 0;
        pointMargin = gryffindor - ravenclaw;
        if(pointMargin >= 300)
        {
            System.out.println("Gryffindor takes the house cup!            ");
        }
        else if(pointMargin >= 0)
        {
            System.out.println("In second place, Gryffindor!           ");
        }
        else if(100 >= pointMargin)
        {
            System.out.println("In third place, Gryffindor!");
        }
        else{
            System.out.println("In fourth place, Gryffindor! ");
        }
        // int margin = amount of points by which gryffindor scored over ravenclaw;


        //if gryffindor wins by a margin of 300 points:
             //print: Gryffindor takes the house cup!

        //if gryffindor wins by a margin of any points: 
            //print: In second place, Gryffindor!

        //if gryffindor loses by a margin of 100 points, they are third:
            //print: In third place, Gryffindor!

        //else:
           //print: In fourth place, Gryffindor! 
        
    }
}
