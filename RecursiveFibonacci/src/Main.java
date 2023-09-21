import java.util.Scanner;

public class Main {

    static int fibonacci ( int n ) {    //Method we will call later

            if ( n == 1 || n == 2 )
                {
                    return 1;           //Where fibonacci stops at
                }
            return fibonacci ( n - 1 ) + fibonacci ( n - 2 );   //fibonacci formula
        }

    public static void main ( String[] args ) {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Please enter the number that you want to calculate Fibonacci : " );
            int inputNumber = scan.nextInt ();                  //Input for which fibonacci number we want to calculate
            System.out.println ( fibonacci ( inputNumber ) );   //We called fibonacci method
        }
}
