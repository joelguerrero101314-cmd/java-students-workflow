import java.util.Scanner;

public class Level_Generator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width of the map: ");
        int width = sc.nextInt();

        System.out.print("Enter the height of the map: ");
        int height = sc.nextInt();

        System.out.println("\n Generated map:\n");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

            
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
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