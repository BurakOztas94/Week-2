public class Main {
    public static void main ( String[] args )
        {
            Fighter f1 = new Fighter ( "Ken" , 15 , 120 , 100 , 55 );
            Fighter f2 = new Fighter ( "Ryu" , 25 , 85 , 85 , 40 );

            Match match = new Match ( f1 , f2 , 85 , 100 );
            match.run ();


        }
}
