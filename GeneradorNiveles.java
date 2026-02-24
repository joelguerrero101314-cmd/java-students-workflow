import java.util.Scanner;

public class GeneradorNiveles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el ancho del mapa: ");
        int ancho = sc.nextInt();

        System.out.print("Ingrese el alto del mapa: ");
        int alto = sc.nextInt();

        System.out.println("\n MAPA GENERADO:\n");

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {

            
                if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}