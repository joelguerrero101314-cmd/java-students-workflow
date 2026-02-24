import java.util.Scanner;

public class Scoreboard_Points {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int points = 0;
        int option;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Earn Points"    );
            System.out.println("2. Subtract Points");
            System.out.println("3. View scoreboard");
            System.out.println("4. Go out"         );
            System.out.print("Select an option: "  );
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("¿How many points to add?: ");
                    points += sc.nextInt();
                    break;

                case 2:
                    System.out.print("¿How many points to subtract?: ");
                    points -= sc.nextInt();
                    break;

                case 3:
                    System.out.println(" Current Points: " + points);
                    break;

                case 4:
                    System.out.println(" Leaving the game...");
                    break;

                default:
                    System.out.println(" Invalid Option.");
            }

        } while (option != 4);

        sc.close();
    }
}