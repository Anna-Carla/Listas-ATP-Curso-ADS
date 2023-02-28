/*Escreva um programa que leia as coordenadas x e y de pontos no R2e calcule sua distancia da origem
(0, 0). */

import java.util.*;
public class atv15 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    Double x, y, d;

    System.out.println("Insira o ponto x: ");
    x = sc.nextDouble();
    System.out.println("Insira o ponto y: ");
    y = sc.nextDouble();
    sc.close();
    d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    System.out.println("A distância é:"+d);
  }
}