import java.util.*;
public class atv12{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int maior=0, posimaior=0, posimenor=0, menor=0;
    int [] vet = new int[5];

    System.out.println("Digite os valores");
    for(int i=0; i<vet.length; i++){
        vet[i] = sc.nextInt();
        if(maior==0 && menor==0){
            maior= vet[i]; menor = vet[i];

        }if(vet[i]>maior){
            maior = vet[i];
            posimaior = i;
        } else if(vet[i]<menor){
            menor = vet[i];
            posimenor = i;
        }
    }
    sc.close();
    System.out.println("Maior: "+maior+"\tPosição: "+posimaior+"\nMenor: "+menor+"\tPosição: "+posimenor);

}
}