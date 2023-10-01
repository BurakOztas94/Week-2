import java.util.Scanner;





public class Main {
    public static void main ( String[] args )
        {
            int cars[], count=3;
            cars = new int[count];
            for(int i=0; i<cars.length; i++)
                cars[i] = (i+1)*2;
            for(int j=0; j<cars.length; j++)
                System.out.print(cars[j] + ",");

        }


   
}
