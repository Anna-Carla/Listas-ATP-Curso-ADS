import java.util.*;
public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float idade=1, soma=0, cont=-1;

        while(idade>0){
            System.out.println("Digite uma idade: ");
            idade = sc.nextFloat();
            if(idade>0){
                soma+= idade;
            }
            cont++;
        }
        sc.close();
        System.out.println("A média das idades: "+soma/cont);
    }
}