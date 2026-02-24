import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(50) + 1;
        int intento = 0;
        int intentos = 0;

        System.out.println("Bienvenido a Adivina el Número (1-50)");

        while (intento != numeroSecreto) {
            System.out.print("Ingresa tu número: ");
            intento = sc.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número es MAYOR");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es MENOR");
            } else {
                System.out.println("¡Correcto! Lo lograste en " + intentos + " intentos.");
            }
        }

        sc.close();
    }
}