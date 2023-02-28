/*Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor 
que C.*/

import java.util.*;
public class atv1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a, b, c, soma;

        System.out.println("Insira 3 números: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        sc.close();

        soma = a+b;

        if ((soma)<c){
            System.out.println("A soma de: "+a+" mais "+b+" é menor que "+c);
        }
        else{
            System.out.println("A soma de: "+a+" mais "+b+" é maior que "+c);
        }
    }
}