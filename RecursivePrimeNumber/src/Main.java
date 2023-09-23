import java.util.Scanner;

public class Main {

    static boolean isPrime ()
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Please enter number :" );
            int number = scan.nextInt ();


            int counter = 0;
            for (int i = 2;i <= number;i++)
                {
                    if ( number % i == 0 )
                        {     //here we divide number
                            counter++;      //if number can dividable then we increase counter

                        }
                }
            if ( number != 0 && number != 1 && counter == 1 )
                {
                    System.out.println ( number + " is  a Prime number." );
                }
            else
                {
                    System.out.println ( number + " is Not a Prime number." );
                }
        /*If any number you entered is divided by only to itself then counter
         does not increase and prints prime number if counter increases and
         divided by more than 1 number so number cannot be a prime number  */
            return isPrime ();
        }

    public static void main ( String[] args )
        {
            isPrime ();
        }
}
