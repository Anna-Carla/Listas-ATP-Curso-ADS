import java.util.*;
public class atv3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vet1 = new int[10];
    int [] vet2 = new int[10];
    System.out.println("Insira os valores:");
    for(int i=0; i<vet1.length; i++){
        vet1[i] = sc.nextInt();
        vet2[i] = vet1[i]*vet1[i];
    }
    System.out.println("Valores digitados");
    for(int i=0; i<vet1.length; i++){
        System.out.println(vet1[i]);
    }
    System.out.println("Quadrados dos valores");
    for(int i=0; i<vet1.length; i++){
        System.out.println(vet2[i]);
    }
    sc.close();
}
}