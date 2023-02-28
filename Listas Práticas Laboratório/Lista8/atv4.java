import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Entre com um numero de fim: ");
        int fim = sc.nextInt();  
        sc.close();
        
        System.out.println("Quantidade de primos: "+quantPrimo(fim));

    }
    public static int quantPrimo(int fim){
        int quantidade=0;
        for(int i = 2; i <= fim; i++) {
       
            boolean primo = true;
            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if(primo==true) {
                quantidade++;
            }  
        }
        return quantidade;
    }
}