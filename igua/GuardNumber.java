package igua;
import java.util.Scanner;
public class GuardNumber {
    public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int secret = (int)(Math.random()* 20) +1;
    int attemps = 0;
    int max_attemps = 5;
    boolean success = false;

    while (attemps < max_attemps && !success ){
      System.out.print("\nInserte el numero a adivinar");
      int number = sc.nextInt();
      if (number == secret){
        success = true;
        System.out.print("Acertaste el numero");
      }else if (number < secret){
        System.out.print("El numero es bajo");
    } else if (number > secret){
        System.out.print("El numero es alto");
      }
      attemps++;
    } 
     if (success){
       System.out.println(" Ganaste con " + attemps + " intentos ");
     }else {
       System.out.println("Perdiste, La puerta permanece cerrada");
       System.out.println ("El numero era:" + secret);
    }
    sc.close();
}
}