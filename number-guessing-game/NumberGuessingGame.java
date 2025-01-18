import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;

        int totalCount = 0;

        while (true) {
            System.out.print("Please enter the number between 1-100: ");
            int playerGuessNumber = scanner.nextInt();
            totalCount++;
            if (playerGuessNumber == randomNumber) {
                System.out.println("You Win");
                System.out.println("You tries " + totalCount + " times");
                break;
            } else if (playerGuessNumber < randomNumber) {
                System.out.println("You Entered the Lower Number, Please Enter again");
            } else {
                System.out.println("Nope, number is High, Please Enter Again");
            }

        }
    }
}
