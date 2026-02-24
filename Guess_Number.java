import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretnumber = random.nextInt(50) + 1;
        int attempt = 0;
        int attempts = 0;

        System.out.println("Welcome to guess the number (1-50)");

        while (attempt != secretnumber) {
            System.out.print("Enter your number: ");
            attempt = sc.nextInt();
            attempts++;

            if (attempt < secretnumber) {
                System.out.println("The number is higher");
            } else if (attempt > secretnumber) {
                System.out.println("The number is lower");
            } else {
                System.out.println("That's right, you did it in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}

