import java.util.*;
public class atv4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x, y, soma;
    int [] vet = new int[8];
    System.out.println("Insira os valores:");
    for(int i=0; i<vet.length; i++){
        vet[i] = sc.nextInt();
    }
    System.out.println("Insira o valor de X: ");
    x = sc.nextInt();
    System.out.println("Insira o valor de Y: ");
    y = sc.nextInt();

    soma = vet[x]+vet[y];
    sc.close();
    System.out.println("Soma: "+soma);
}
}

