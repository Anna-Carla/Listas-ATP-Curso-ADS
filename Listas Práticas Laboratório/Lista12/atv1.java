import java.util.*;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] mat = new double[50][50];
        double [] vet = new double[50];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    vet[i] = mat[i][j];
                }
            }
        }

        /*for (int i = 0; i < mat.length; i++) { // imprimir matriz
            for (int j = 0; j < mat.length; j++) {
                System.out.print("\t" + mat[i][j]);
            }
            System.out.println("\n");
        }*/

        sc.close();
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}