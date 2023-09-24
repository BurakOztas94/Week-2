package example3;

public class Main {
    public static void main ( String[] args )
        {
            namePrint ();
            add ( 5,15 );
            printNameSurname ( "Burak","Pelte" );
        }


    public static void printNameSurname (String name, String surname){
        System.out.println ("Name and Surname : " +(name+" " +surname));
    }
    public static void add(int a,int b){
        int result =a+b;
        System.out.println ("Result : " + result);


    }

    public static void namePrint(){
        System.out.println ("Burak");
    }


}
