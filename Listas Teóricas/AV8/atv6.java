import java.util.*;
public class atv6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vet = new int[5];
    int [] vet1 = new int[5];

    System.out.println("Números: ");
    for (int i = 0; i < vet.length; i++) {
        vet[i] = sc.nextInt();
        while(i<0 && i>50){
            System.out.println("Digite outro número: ");
            vet[i] = sc.nextInt();
        }
        if(vet[i]%2!=0){
            vet1[i] = vet[i];
        }
    }
    for (int i = 0; i < vet1.length; i++) {
        System.out.print("Vetor: "+vet[i]);

        if(vet1[i]!=0){
        System.out.print("Impar: "+vet1[i]);
        }

    }
    sc.close();
    }
}