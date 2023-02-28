import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int valorin, valorfin, soma=0;

        System.out.println("Valor Inicial: ");
        valorin = sc.nextInt();
        System.out.println("Valor Final: ");
        valorfin = sc.nextInt();
        sc.close();

        if(valorin<valorfin){
          for(int i=valorin; i<=valorfin; i++){
            if(i%2!=0){
                soma+= i;
            }
          } 
          System.out.println("A soma dos impares é: "+soma);
        } else{
            System.out.println("Intervalos de valores inválidos");
        }
    }
}