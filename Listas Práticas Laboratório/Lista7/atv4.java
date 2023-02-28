import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int início = 1;
        System.out.println("Entre com um numero: ");
        int fim = sc.nextInt();  
        sc.close();     
        
        if(fim>1){
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
    
        if(posicao==fim && primo==true) {
            System.out.println("Este número é primo!\n");
        }  
    }
    }
}
}