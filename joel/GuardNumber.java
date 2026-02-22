package joel;

import java.util.Random;
import java.util.Scanner;

public class GuardNumber {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    int secretNumber = random.nextInt(20) + 1; // Number between 1 and 20
    int maxAttempts = 5;
    int attemptCount = 0;
    boolean isOpen = false;

    System.out.println("El Guardián protege un número secreto entre 1 y 20.");
    System.out.println("Tienes 5 intentos para abrir la puerta.");

    while (attemptCount < maxAttempts) {
      System.out.print("Ingresa el numero: ");
      int userGuess = sc.nextInt();
      attemptCount++;

      if (userGuess == secretNumber) {
        System.out.println("¡Correcto! La puerta está abierta.");
        System.out.println("Intentos utilizados: " + attemptCount);
        isOpen = true;
        break;
      } else if (userGuess > secretNumber) {
        System.out.println("¡Demasiado alto!");
      } else {
        System.out.println("¡Demasiado bajo!");
      }
    }

    if (!isOpen) {
      System.out.println("La puerta permanece cerrada.");
      System.out.println("El número secreto era: " + secretNumber);
    }

    sc.close();
  }
}
