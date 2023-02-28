/*Receba o sal ́ario-base de um funcion ́ario. Calcule e imprima o sal ́ario a receber, sabendo-se que esse
funcion ́ario tem uma gratificac ̧ ̃ao de 5% sobre o sal ́ario-base. Al ́em disso, ele paga 7% de imposto sobre
o sal ́ario-base */

import java.util.*;
public class atv11 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    double bruto, liq;

    System.out.println("Insira seu salário base: ");
    bruto = sc.nextDouble();
    sc.close();
    liq = bruto + (bruto*0.05)-(bruto*0.07);

    System.out.println("Salário a receber: "+ liq);
  }
}