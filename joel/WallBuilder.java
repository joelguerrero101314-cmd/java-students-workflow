package joel;

import java.util.Scanner;

public class WallBuilder {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int width;
    int height;

    System.out.print("Ingrese el ancho de la muralla: ");
    width = sc.nextInt();

    System.out.print("Ingrese el alto de la muralla: ");
    height = sc.nextInt();

    System.out.println("\nConstruyendo muralla...\n");

    for (int row = 1; row <= height; row++) {

      for (int column = 1; column <= width; column++) {

        // Bordes: primera fila, última fila,
        // primera columna o última columna
        if (row == 1 || row == height || column == 1 || column == width) {
          System.out.print("#");
        } else {
          System.out.print(" ");
        }
      }

      System.out.println();
    }

    sc.close();
  }
}
