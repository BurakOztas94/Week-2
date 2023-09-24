package example2;

import java.util.Scanner;

public class Main {

    public static void averageCalculate ( int a , int b )
        {
            int total = a + b;
            double average = (double) total / 2;

            System.out.println ( average );
        }

    public static void main ( String[] args )
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ("Please enter number 1 : ");
            int n1= scan.nextInt ();
            System.out.print ("Please enter number 2 : ");
            int n2 =scan.nextInt ();
            averageCalculate ( n1 , n2 );

        }
}
