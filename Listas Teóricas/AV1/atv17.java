/*Fac ̧a um programa para ler as dimens ̃oes de um terreno (comprimento c e largura l), bem como o prec ̧o
do metro de tela p. Imprima o custo para cercar este mesmo terreno com tela.*/

import java.util.*;
public class atv17 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    float c, l, m, custo;

    System.out.println("Insira o comprimento: ");
    c = sc.nextFloat();
    System.out.println("Insira a largura: ");
    l = sc.nextFloat();
    System.out.println("Insira o preço do metro: ");
    m = sc.nextFloat();
    sc.close();
    
    custo = ((c*2)+(l*2))*m;
    System.out.println("Custo parar cercar: "+custo+" reais");
  }
}