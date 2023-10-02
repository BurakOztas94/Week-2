import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1, element, num = 0;

        System.out.print("Length of array - n - : ");
        int n = scan.nextInt();

        int[] numbers = new int[n];

        System.out.println("Please enter elements of array :");

        while (i <= n) {
            System.out.print(i + ". element : ");
            element = scan.nextInt();
            i++;
            numbers[num] = element;
            num++;
        }
        System.out.print("Sorted : ");
        Arrays.sort (numbers);
        System.out.println(Arrays.toString (numbers));
    }
}