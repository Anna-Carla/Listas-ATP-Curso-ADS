/*Determine se um determinado ano lido e bissexto. Sendo que um ano ´e bissexto se for divis´ıvel por 400
ou se for divis´ıvel por 4 e nao for divis ˜ ´ıvel por 100. Por exemplo: 1988, 1992, 1996.
*/

import java.util.*;
public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.println("Digite o ano: ");
        ano = sc.nextInt();
        sc.close();

        if(ano%400==0){
            System.out.println("O ano é bissexto");
        } else if(ano%4==0 && ano%100!=0){
            System.out.println("O ano é bissexto");
        } else{
            System.out.println("O ano não é bissexto");
        }
    }
}