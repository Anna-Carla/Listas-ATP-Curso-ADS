/*Fac ̧a um programa que leia um n ́umero inteiro positivo de trˆes d ́ıgitos (de 100 a 999). Gere outro n ́umero
formado pelos d ́ıgitos invertidos do n ́umero lido. Exemplo: n ́umeroLido = 123, n ́umeroGerado = 321*/

import java.util.*;
public class atv12 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, uni, dez, cen, inv;
    
    System.out.println("Insira um número com 3 dígitos:");
    num = sc.nextInt();
    uni = num % 10;
    dez = (num % 100) / 10;
    cen = num / 100;
    inv = uni*100+dez*10+cen;
        sc.close();    
    System.out.print(inv);
  }
}
