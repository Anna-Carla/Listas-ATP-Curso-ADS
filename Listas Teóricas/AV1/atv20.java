/*Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre: o total a
pagar com desconto de 10%; o valor de cada parcela, no parcelamento de 3× sem juros; a comiss ̃ao do
vendedor, no caso da venda ser parcelada (5% sobre o valor total). */

import java.util.*;
public class atv20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double vprod, vdesc, vparc, c;

        System.out.println("Insira o valor do produto: ");
        vprod = sc.nextDouble();
        sc.close();

        vdesc = vprod - (vprod*0.1);
        vparc = vprod/3;
        c = vprod*0.05;

        System.out.println("Valor com desconto: "+vdesc+"\nValor parcelas: "+vparc+"\nComissão: "+c);
    }
}