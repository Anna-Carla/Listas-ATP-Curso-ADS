import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int quantidade=0;      
        System.out.println("Entre com um numero de início: ");
        int início = sc.nextInt();
        System.out.println("Entre com um numero de fim: ");
        int fim = sc.nextInt();  
        sc.close();     
        
        if(início==1){ //gambiarra para o 1 não entrar como primo
            início = 2;
        }

        for(int posicao = início; posicao <= fim; posicao++) {
           System.out.println("\nEstou na posição: "+posicao);        
            boolean primo = true;
            for(int j = 2; j < posicao; j++) {            
                if(posicao % j == 0) {
                    primo = false;
                    break;
                } 
            }
            if(primo==true) {
                quantidade++;
                System.out.println("Este número é primo!\n");
            }  
            else
            {
                System.out.println("Este número não é primo\n");    
            }
        }
        System.out.println("Quantida de números primos: "+quantidade);
    }
}