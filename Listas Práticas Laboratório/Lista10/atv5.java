import java.util.*;
public class atv5{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vet = new int[10];
    int [] mult = new int[10];

    for (int i = 0; i < mult.length; i++) {
        vet[i] = sc.nextInt();
        mult[i] = vet[i]*5;
    }
    for (int i = 0; i < mult.length; i++) {
        System.out.print("\nVetor: "+vet[i]+" Vezes 5: "+mult[i]);
    }
    sc.close();
}
}