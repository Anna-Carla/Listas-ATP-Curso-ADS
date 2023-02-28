import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;
        float[] vet = new float[5];

        System.out.println("Valores:");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextFloat();
        }
        System.out.println("Código (0, 1 ou 2): ");
        num = sc.nextFloat();
        sc.close();

        if (num == 1) {
            for (int i = 0; i < vet.length; i++) {
                System.out.println(vet[i]);
            }
        } else if (num == 2) {
            for (int i = 4; i>-1; i--) {
                System.out.println(vet[i]);
            }
        } else if (num == 0) {
            System.out.println("Fim");
        } else {
            System.out.println("Código inválido!");
        }
    }
}