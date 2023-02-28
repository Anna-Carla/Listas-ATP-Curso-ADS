import java.util.*;
public class atv16 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    float p, a1, a2, a3, atotal, g1, g2, g3;

    System.out.println("Valor do prêmio: ");
    p = sc.nextFloat();
    System.out.println("Valor apostador 1: ");
    a1 = sc.nextFloat();
    System.out.println("Valor apostador 2: ");
    a2 = sc.nextFloat();
    System.out.println("Valor apostador 3: ");
    a3 = sc.nextFloat();
    sc.close();

    atotal = a1 + a2 + a3;
    g1 = (a1/atotal)*p;
    g2 = (a2/atotal)*p;
    g3 = (a3/atotal)*p;

    System.out.println("\nResultado");
    System.out.printf("Apostador 1 ganhou:"+"%.2f",g1);
    System.out.printf("\nApostador 2 ganhou:"+"%.2f",g2);
    System.out.printf("\nApostador 3 ganhou:"+"%.2f",g3);
  }
}
