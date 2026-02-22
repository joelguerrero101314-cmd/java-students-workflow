package igua;
import java.util.Scanner;
public class GuardNumber {
    public static void main (String[]arg){
    Scanner sc = new Scanner (System.in);
    int secret = (int)(Math.random()* 20) +1;
    int attemps = 0;
    final int MAX_ATTEMPS = 5;
    boolean success = false;

    while (attemps < MAX_ATTEMPS && !success ){
      System.out.print("Inserte el numero a adivinar");
      int number = sc.nextInt();
      
      attemps++;
    } 
    sc.close();
}
}