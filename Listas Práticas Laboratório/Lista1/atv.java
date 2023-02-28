/* Escreva um programa para ler as notas da 1ª e 2ª avaliações de um aluno, calcular e mostrar a 
média das notas*/

import java.util.*;
public class atv {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float n1, n2, m;
    
    System.out.println("Insira a 1° nota: ");
    n1 = sc.nextFloat();
    System.out.println("Insira a 2° nota: ");
    n2 = sc.nextFloat();
    sc.close();
    m = (n1+n2)/2;
    System.out.print("Sua média é: "+m);
    }
}