import java.util.Scanner;

public class Scoreboard_Points {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int puntos = 0;
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Sumar puntos");
            System.out.println("2. Restar puntos");
            System.out.println("3. Ver marcador");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos puntos sumar?: ");
                    puntos += sc.nextInt();
                    break;

                case 2:
                    System.out.print("¿Cuántos puntos restar?: ");
                    puntos -= sc.nextInt();
                    break;

                case 3:
                    System.out.println(" Puntos actuales: " + puntos);
                    break;

                case 4:
                    System.out.println(" Saliendo del juego...");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
