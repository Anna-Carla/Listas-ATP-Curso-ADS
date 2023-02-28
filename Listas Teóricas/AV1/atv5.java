/*Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit 1. */
import java.util.*;
public class atv5 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    double c, total;

    System.out.println("Insira a temperatura em °C:");
    c = sc.nextDouble();
    sc.close();
    total = ((c*1.8)+32);
    System.out.println("Resultado: " + total+"°F");
  }
}