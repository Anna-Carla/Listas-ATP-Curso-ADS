/*Leia um n ́umero inteiro de 4 d ́ıgitos (de 1000 a 9999) e imprima 1 d ́ıgito por linha */

import java.util.*;
public class atv13 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, x=0;

    System.out.print("Insira um número de 4 digitos: ");
    num = sc.nextInt();
    sc.close();

    String str = String.valueOf(num);

    while (4>x) {
        System.out.println(str.charAt(x));
        x++;
    }
  }
}