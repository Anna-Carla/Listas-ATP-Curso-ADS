import java.util.*;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0, posição = 0;
        int[] vet = new int[5];

        System.out.println("Digite os valores");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
            if (maior == 0) {
                maior = vet[i];
            } if (vet[i] > maior) {
                maior = vet[i];
                posição = i;
            }
        }
        sc.close();
        System.out.println("Maior: " + maior + "\nPosição: " + posição);
    }
}