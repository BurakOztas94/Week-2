public class PatternMethod {
    public void patternCalculator ( int a , int b , boolean isDecreasing )
        {

            if ( a > 0 && isDecreasing )
                {
                    System.out.print ( a + " " );
                    patternCalculator ( a - 5 , b , true );

                }
            else
                {
                    if ( a <= b )
                        {
                            System.out.print ( a + " " );
                            patternCalculator ( a + 5 , b , false );
                        }
                }
        }
}
