import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int soma=0, início=1, fim;      
        System.out.println("Entre com um numero: ");
        fim = sc.nextInt();  
        sc.close();     
        
        if(início==1){ //gambiarra para o 1 não entrar como primo
            início = 2;
        }

        for(int posicao = início; posicao <= fim; posicao++) {        
            boolean primo = true;
            for(int j = 2; j < posicao; j++) {            
                if(posicao % j == 0) {
                    primo = false;
                    break;
                } 
            }
            if(primo==true) {
                soma+= posicao;
            }  
        }
        System.out.println("Soma dos números primos: "+soma);
    }
}