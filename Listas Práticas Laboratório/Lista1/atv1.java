/*Escreva um programa que leia as medidas dos lados de um retângulo, calcule e imprima a
medida do seu perímetro, da área do retângulo e da diagonal.*/

import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b, alt, p, a, d;

        System.out.println("Insira a base: ");
        b = sc.nextDouble();
        System.out.println("Insira a altura: ");
        alt = sc.nextDouble();
        sc.close();

        p = (b+b)+(alt+alt);
        a = b*alt;
        d = Math.sqrt((b*b)+(alt*alt));
        System.out.println("Perimetro: "+p+"\nÁrea: "+a+"\nDiagonal: "+d);
    }
}