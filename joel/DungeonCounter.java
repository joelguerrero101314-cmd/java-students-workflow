package joel;

import java.util.Scanner;

public class DungeonCounter {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int totalRooms;

    System.out.print("Ingrese la cantidad de salas del dungeon: ");
    totalRooms = scanner.nextInt();

    for (int roomNumber = 1; roomNumber <= totalRooms; roomNumber++) {

      if (roomNumber % 3 == 0 && roomNumber % 5 == 0) {
        System.out.println("Sala " + roomNumber + ": Sala legendaria");
      } else if (roomNumber % 3 == 0) {
        System.out.println("Sala " + roomNumber + ": Sala con trampa");
      } else if (roomNumber % 5 == 0) {
        System.out.println("Sala " + roomNumber + ": Sala con tesoro");
      } else {
        System.out.println("Sala " + roomNumber + ": Sala normal");
      }
    }

    scanner.close();
  }
}
