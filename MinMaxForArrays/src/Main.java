import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args)
        {
            Scanner scan = new Scanner (System.in);
            System.out.print ("Please enter number : ");
            int number = scan.nextInt ();
            int[] list = {15,12,788,1,-1,-778,2,0};



            int minimumClosest = Integer.MIN_VALUE;
            int maximumClosest = Integer.MAX_VALUE;

            for (int i : list)
                {
                    if ( i < number && i > minimumClosest )
                        {
                            minimumClosest = i;
                        }
                    if ( i > number && i < maximumClosest )
                        {
                            maximumClosest = i;
                        }
                }

            System.out.println ("Nearest smaller number to the target: : " + minimumClosest);
            System.out.println ("Nearest larger number to the target: : " + maximumClosest);
        }
}