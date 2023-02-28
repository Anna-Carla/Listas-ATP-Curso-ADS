import java.util.*;
public class atv6 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    double f, total;

    System.out.println("Insira a temperatura em °F:");
    f = sc.nextDouble();
    sc.close();
    total = ((f-32)/1.8);
    System.out.println("Resultado: " + total+"°C");
  }
}