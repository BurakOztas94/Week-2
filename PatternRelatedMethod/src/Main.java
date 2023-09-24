import java.util.Scanner;

public class Main {

    static boolean patternCalculator ( int a )
        {


            if ( a > 0 )
                {
                    System.out.print ( a + " "  );
                    a -= 5;


                    if ( a == 0 ||a<0)
                        {
                            System.out.print ( a + " " );
                            a += 5;

                        }



                }
            return patternCalculator ( a );
        }

    public static void main ( String[] args )
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Please enter number : " );
            int number = scan.nextInt ();

            patternCalculator ( number );
        }
}
