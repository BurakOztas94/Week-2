import javax.swing.*;
import java.util.Scanner;

public class Main{
   static void  isPalindrome( int number)
       {

    int temp = number,reverseNumber =0,lastNumber;

    while(temp !=0)
    {
        lastNumber =temp%10;
        reverseNumber =(reverseNumber*10)+lastNumber;
        temp/=10;
    }
           if(number!=reverseNumber)
           {
               System.out.println ("**"+number + "** is Not a Palindrome Number ");
           }else{
               System.out.println ("**"+number + "** is a Palindrome Number ");
           }
       }


    public static void main ( String[] args )
        {

            Scanner scan = new Scanner ( System.in );
            System.out.print ("Please enter a number  : ");
            int inputNumber =scan.nextInt ();

            isPalindrome ( inputNumber );

        }
}
