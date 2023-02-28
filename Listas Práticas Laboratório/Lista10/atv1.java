import java.util.*;
public class atv1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vet = new int[5];
    int soma=0;

    for (int i = 0; i < vet.length; i++) {
        vet[i] = sc.nextInt();
        soma+= vet[i];
    }
    System.out.println("Soma: "+soma);
    sc.close();
}
}