import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5]; //Wrong guess collector array
        boolean isWin = false;
        boolean isWrong = false;

        //System.out.println(number);  // for which number randomly created and prints
        while (right < 5) {             //5 rights for program
            System.out.print("Please enter your guess : ");
            selected = scan.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter number between 0-100 .");
                if (isWrong) {
                    right++;
                    System.out.println("Wrong input. Remain rights : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("The next wrong input will reduce your remaining rights.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations ,right guess ! The number you guessed  : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Wrong input number !");
                if (selected > number) {
                    System.out.println(selected + " number is bigger than secret number.");
                } else {
                    System.out.println(selected + " number is smaller than secret number.");
                }

                wrong[right++] = selected;
                System.out.println("Remain rights : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost ! ");
            if (!isWrong) {
                System.out.println("Secret number is : "+number+"\nYour guesses : " + Arrays.toString(wrong));
            }
        }

    }
}