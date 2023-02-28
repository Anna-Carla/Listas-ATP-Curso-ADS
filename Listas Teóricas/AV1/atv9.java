/*Uma empresa contrata um encanador a R$ 30,00 por dia. Fac ̧a um programa que solicite o n ́umero de
dias trabalhados pelo encanador e imprima a quantia l ́ıquida que dever ́a ser paga, sabendo-se que s ̃ao
descontados 8% para imposto de renda.*/

import java.util.*;
public class atv9 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    float dia, total;

    System.out.println("Insira os dias trabalhados: ");
    dia = sc.nextFloat();
    sc.close();
    total = (dia*30)*8/100;
    
    System.out.println("Valor a pagar: "+  total);
  }
}
