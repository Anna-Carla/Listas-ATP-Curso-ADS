import java.util.*;
public class atv1{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vet [] = new int [10];

    for (int i = 0; i < vet.length; i++) {
        vet [i] = sc.nextInt();
    }
    for (int i = 0; i < vet.length; i++) {
        System.out.print(vet[i]+" ");
    }
    System.out.println("\n"); //Quebra de linha
    for (int i = vet.length-1; i >=0; i--) {
        System.out.print(vet[i]+" ");        
    }
    sc.close();
    }
}