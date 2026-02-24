import java.util.Random;
import java.util.Scanner;

public class Simulator_Battle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lifeplayer = 100;
        int lifeenemy = 100;

        System.out.println("SIMULADOR DE BATALLA");
        System.out.print("¿Cuántas rondas quieres jugar?: ");
        int rondas = sc.nextInt();

        for (int i = 1; i <= rondas && lifeplayer > 0 && lifeenemy > 0; i++) {

            System.out.println("\n--- Round " + i + " ---");
            System.out.print("Type of attack (1 = Physicist, 2 = Magical): ");
            int tipo = sc.nextInt();

            int basedamage = random.nextInt(20) + 10;
            boolean critical = random.nextBoolean();

            if (critical) {
                basedamage *= 2;
                System.out.println(" ¡critical strike!");
            }

            // Enemigos: Defensa, Daño, vida

            int defence = random.nextInt(10);

            int Finaldamage;

            if (tipo == 1 && basedamage > defence) {
                Finaldamage = basedamage - defence;
            } else if (tipo == 2 && basedamage > defence) {
                Finaldamage = basedamage - (defence / 2);
            } else {
                Finaldamage = 0;
            }

            lifeenemy -= Finaldamage;

            System.out.println("damage caused: " + Finaldamage);
            System.out.println("life of enemy: " + lifeenemy);
        }

        if (lifeenemy <= 0) {
            System.out.println("\n ¡You won the battle!");
        } else {
            System.out.println("\n The enemy is still standing.");
        }

        sc.close();
    }
}
