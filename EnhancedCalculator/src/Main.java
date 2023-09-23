import java.util.Scanner;

public class Main {

    static void additionOperation ()
        {
            Scanner scan = new Scanner ( System.in );
            int number, result = 0, i = 1;
            while (true)
                {
                    System.out.print ( i++ + ". number :" );
                    number = scan.nextInt ();
                    if ( number == 0 )
                        {
                            break;
                        }
                    result += number;
                }
            System.out.println ( "Result : " + result );
        }

    static void subtractionOperation ()
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Amount of number you will enter :" );
            int counter = scan.nextInt ();
            int number, result = 0;

            for (int i = 1;i <= counter;i++)
                {
                    System.out.print ( i + ". number :" );
                    number = scan.nextInt ();
                    if ( i == 1 )
                        {
                            result += number;
                            continue;
                        }
                    result -= number;
                }

            System.out.println ( "Result : " + result );
        }

    static void multiplicationOperation ()
        {
            Scanner scan = new Scanner ( System.in );
            int number, result = 1, i = 1;

            while (true)
                {
                    System.out.print ( i++ + ". number :" );
                    number = scan.nextInt ();

                    if ( number == 1 )
                        break;

                    if ( number == 0 )
                        {
                            result = 0;
                            break;
                        }
                    result *= number;
                }

            System.out.println ( "Result : " + result );
        }

    static void divisionOperation ()
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "How many number you will enter :" );
            int counter = scan.nextInt ();
            double number, result = 0.0;

            for (int i = 1;i <= counter;i++)
                {
                    System.out.print ( i + ". number :" );
                    number = scan.nextDouble ();
                    if ( i != 1 && number == 0 )
                        {
                            System.out.println ( "Denominator must not be 0" );
                            continue;
                        }
                    if ( i == 1 )
                        {
                            result = number;
                            continue;
                        }
                    result /= number;
                }

            System.out.println ( "Result : " + result );
        }

    static void exponentialOperation ()
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Please enter base number :" );
            int base = scan.nextInt ();
            System.out.print ( "Please enter exponent number :" );
            int exponent = scan.nextInt ();
            int result = 1;

            for (int i = 1;i <= exponent;i++)
                {
                    result *= base;
                }

            System.out.println ( "Result : " + result );
        }

    static void factorial ()
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Enter number :" );
            int n = scan.nextInt ();
            int result = 1;

            for (int i = 1;i <= n;i++)
                {
                    result *= i;
                }

            System.out.println ( "Result : " + result );
        }

    static void modeOperation ()
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Enter number 1 :" );
            int number1 = scan.nextInt ();
            System.out.print ( "Enter number 2 :" );
            int number2 = scan.nextInt ();
            if ( number2 == 0 )
                {
                    System.out.println ( "2. Number must not be 0 " );

                }
            else
                {
                    int result = number1 % number2;
                    System.out.println ( result );
                }
        }

    static void rectangle ()
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Enter short edge :" );
            int number1 = scan.nextInt ();
            System.out.print ( "Enter long edge :" );
            int number2 = scan.nextInt ();
            if ( number1 == 0 || number2 == 0 )
                {
                    System.out.println ( "Edges must not be 0 " );

                }
            else
                {
                    int perimeter = 2 * ( number1 + number2 );
                    int area = number1 * number2;

                    System.out.println ( "Perimeter of rectangle : " + perimeter );
                    System.out.println ( "Area of rectangle : " + area );
                }
        }


    public static void main ( String[] args )
        {
            Scanner scan = new Scanner ( System.in );
            int select;
            String menu = """
                    1- Addition
                    2- Subtraction
                    3- Multiplication
                    4- Division
                    5- Exponential
                    6- Factorial
                    7- Mode
                    8- Rectangle Perimeter and Area Calculation
                    0- Exit""";

            do
                {
                    System.out.println ( menu );
                    System.out.print ( "Please enter operation :" );
                    select = scan.nextInt ();
                    switch (select)
                        {
                            case 1 -> additionOperation ();
                            case 2 -> subtractionOperation ();
                            case 3 -> multiplicationOperation ();
                            case 4 -> divisionOperation ();
                            case 5 -> exponentialOperation ();
                            case 6 -> factorial ();
                            case 7 -> modeOperation ();
                            case 8 -> rectangle ();
                            case 0 -> System.out.println ( "Logged out :" );
                            default -> System.out.println ( "Wrong number is entered.Try again!" );
                        }
                } while (select != 0);


        }
}