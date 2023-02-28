/*Faça um programa que receba um número positivo e maior que zero, calcule e mostre:
• O número digitado ao quadrado;
• O número digitado ao cubo;
• A raiz quadrada do número digitado;
• A raiz cúbica do número digitado*/

import java.util.*;
public class atv3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x, q, c, rq, rc;

    System.out.println("Insira um número: ");
    x = sc.nextDouble();
    sc.close();
        if(x>0) {
         q = x*x;
         c = x*x*x;
         rq = Math.sqrt(x);
         rc = Math.cbrt(x);
         System.out.println("Ao quadrado: "+q+"\nAo cubo: "+c+"\nRaiz quadrada: "+rq+"\nRaiz cúbica: "+rc);
        }
         else{
        System.out.println("Número inválido");
        }
    }
}