/*Fac ̧a um programa que leia o valor de um produto e imprima o valor com desconto, tendo em vista que
o desconto foi de 12%. */

import java.util.*;
public class atv18 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    double p, t;

    System.out.println("Insira o valor do produto: ");
    p = sc.nextDouble();
    sc.close();

    t = (p - (p*0.12));

    System.out.println("Valor a pagar: "+t);
  }
}