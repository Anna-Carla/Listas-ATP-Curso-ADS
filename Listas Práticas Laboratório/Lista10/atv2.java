import java.util.*;
public class atv2{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vet = new int[5];
    int soma=0, media=0;

    for (int i = 0; i < vet.length; i++) {
        vet[i] = sc.nextInt();
        soma+= vet[i];
    }
    media = soma/ 5;
    System.out.println("Média dos vetores: "+media+"\n");

    for (int i = 0; i < vet.length; i++) {
        if(vet[i]>media){
            System.out.println("Maior que a média: "+ vet[i]);
        } else if(vet[i]<media){
            System.out.println("Menor que a média: "+vet[i]);
        }
    }
    sc.close();
}
}