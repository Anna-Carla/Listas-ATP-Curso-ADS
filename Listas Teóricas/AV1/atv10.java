/*Fac ̧a um programa que leia o valor da hora de trabalho (em reais) e n ́umero de horas trabalhadas no
mˆes. Imprima o valor a ser pago ao funcion ́ario, adicionando 10% sobre o valor calculad */

import java.util.*;
public class atv10 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    double reais, mes, valor;

    System.out.println("Insira o valor de horas trabalhadas: ");
    reais = sc.nextDouble();
    System.out.println("Insira as horas trabalhadas no mês: ");
    mes = sc.nextDouble();
    sc.close();
    valor = (reais*mes)+((reais*mes)*0.1);
    System.out.println("Valor a ser pago: "+ valor);
  }
}