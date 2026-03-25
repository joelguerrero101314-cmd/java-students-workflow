package joel;

import java.util.Scanner;

public class PlayerConsole {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int lives = 3;
    int option;

    do {
      System.out.println("\n=== CONSOLA DEL JUGADOR ===");
      System.out.println("1. Ganar una vida");
      System.out.println("2. Perder una vida");
      System.out.println("3. Ver estado");
      System.out.println("4. Salir");
      System.out.print("Seleccione una opción: ");

      option = sc.nextInt();

      switch (option) {

        case 1:
          lives++;
          System.out.println("Has ganado una vida.");
          break;

        case 2:
          if (lives > 0) {
            lives--;
            System.out.println("Has perdido una vida.");
          } else {
            System.out.println("No puedes tener vidas negativas.");
          }
          break;

        case 3:
          System.out.println("Vidas actuales: " + lives);
          break;

        case 4:
          System.out.println("Saliendo del juego...");
          break;

        default:
          System.out.println("Opción inválida. Intente nuevamente.");
      }

    } while (option != 4);

    sc.close();
  }
}