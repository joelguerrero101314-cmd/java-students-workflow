package igua;

import java.util.Scanner;
public class PlayerConsole {
        public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int life = 3;
        int option = 0;

        do{
            System.out.println("\n===========================================================");
            System.out.println("====                 Consola de Vida                   ====");
            System.out.println("===========================================================");
            System.out.println("===                1. Ganar una vida                    ===");
            System.out.println("===                2. Perder una vida                   ===");
            System.out.println("===                3. Ver estado                        ===");
            System.out.println("===                4. Salir                             ===");
            System.out.println("===========================================================\n");
            option = sc.nextInt();
            switch (option){
                case 1:
                    life++;
                    System.out.println("Has ganado una vida");
                    break;
                case 2: 
                    if(life>0){
                        life--;
                        System.out.println("Has perdido una vida");
                    }else{
                        System.out.println("No puedes tener vidas negativas");
                    }
                    break;
                case 3:
                    System.out.println("Tu vida actual es: " + life);
                    break;
                case 4:
                    System.out.println("Saliendo del menú");
                    break;
                default:
                    System.out.println("Opcion incorrecta, vuelve a elegir una de las opciones");
            }
            if (life <= 0 ){
                System.out.println("Game Over");
            }
        }while (option!=4);
        sc.close();   
    }
}
