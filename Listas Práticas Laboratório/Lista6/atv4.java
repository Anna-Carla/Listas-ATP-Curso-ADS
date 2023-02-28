import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num=1, cont=0, soma=0, media, maior=0, menor=0, mediapar, par=0, contpar=0;

        while(num!=0){
            System.out.println("Digite um número: ");
            num = sc.nextFloat();
            soma+= num;
            
            if(num!=0){ //para não rodar com o 0 
            if (cont == 0) { //calculo de menor e maior número
                maior = num;
                menor = num;
            } else if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }

            if(num%2==0){ //identificar se é par 
                par+=num;
                contpar++;
            }
            cont++;
        }
        }
        sc.close();
        media= soma/cont;
        mediapar= par/contpar;
        System.out.println("\nSoma dos números: "+soma+"\nNúmeros digitados: "+cont+"\nMédia dos números: "+media);
        System.out.println("\nMaior número: "+maior+"\nMenor número: "+menor+"\nMédia dos pares: "+mediapar);
    }
}
