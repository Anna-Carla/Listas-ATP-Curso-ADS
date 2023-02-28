/*Leia o salario de um funcion ́ario. Calcule e imprima o valor do novo sal ́ario, sabendo que ele recebeu um
aumento de 25%. */

import java.util.*;
public class atv19 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    double s, l;

    System.out.println("Insira seu salário: ");
    s = sc.nextDouble();
    sc.close();

    l = s+(s*0.25);

    System.out.println("Novo salário: "+l);
  }
}
