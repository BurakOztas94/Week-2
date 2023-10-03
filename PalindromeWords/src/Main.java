import java.util.Scanner;

public class Main {

    static void isPalindrome2 (String str)
        {
            String reverse = "";
            for ( int i = str.length () - 1;i >= 0;i-- )
                {
                    reverse += str.charAt (i);
                }
            if ( str.equals (reverse) )
                System.out.println ("'" + str + "'" + " is palindrome word");
            else
                System.out.println ("'" + str + "'" + " is not palindrome word");
        }

    public static void main (String[] args)
        {
            Scanner scan = new Scanner (System.in);
            System.out.print ("Please enter word : ");
            String palindrome = scan.nextLine ();
            isPalindrome2 (palindrome);
        }
}