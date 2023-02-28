import java.util.*;
public class atv7 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    double grau, total;

    System.out.println("Insira o grau: ");
    grau = sc.nextDouble();
    sc.close();
    total = ((grau*3.14)/180);
    System.out.println("Total: " + total);
  }
}