
public class atv6 {
    public static void main(String[] args) {

        int soma=0, início=1, fim=2000000;      

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