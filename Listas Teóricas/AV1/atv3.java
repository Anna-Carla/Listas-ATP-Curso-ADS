import java.util.*;
public class atv3 {
  public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    float num1, num2, num3, soma;

    System.out.println("Digite 3 números: ");
    num1 = sc.nextFloat();
    num2 = sc.nextFloat();
    num3 = sc.nextFloat();
    sc.close();

    soma = (num1 + num2 + num3);
    System.out.println("Resultado: " + soma);
  }
}  