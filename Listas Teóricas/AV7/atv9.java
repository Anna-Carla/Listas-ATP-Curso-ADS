import java.util.*;
public class atv9{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int soma=0, media;
    int [] vet = new int[15];

    for(int i=0; i<vet.length; i++){
        System.out.println("Nota:");
        vet[i] = sc.nextInt();
        soma += vet[i];
    }
    sc.close();
    media = soma/vet.length;
    System.out.println("Média das Notas: "+media);
}
}