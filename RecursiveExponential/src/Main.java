import java.util.Scanner;

public class Main {

    static int exponential(){
        Scanner scan=new Scanner ( System.in );
        System.out.print ("Please enter base number : ");
        int base=scan.nextInt ();
        System.out.print ("Please enter exponent number : ");
        int exponent=scan.nextInt ();
        int result=1;

        for(int i=1; i<=exponent;i++){              //infinite exponent calculator 0 error must be define later
                result*=base;
                    }
                System.out.println ("Result : "+ result);
        return exponential ()  ;

    }
    public static void main ( String[] args )
        {

            exponential ( );
        }
}
