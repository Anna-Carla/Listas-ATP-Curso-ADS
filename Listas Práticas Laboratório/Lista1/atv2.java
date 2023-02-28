/*Faça um programa que receba o custo de um espetáculo teatral e o preço do convite desse 
espetáculo. Esse programa deverá calcular e mostrar a quantidade de convites que devem ser 
vendidos para que pelo menos o custo do espetáculo seja alcançado.*/

import java.util.*;
public class atv2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double c, p, q;

    System.out.println("Insira o custo do espetáculo: ");
    c = sc.nextDouble();
    System.out.println("Insira o preço do convite: ");
    p = sc.nextDouble();
    sc.close();

    q = c/p;

    System.out.println("Deve ser vendidos: "+q+" convites");
}
}