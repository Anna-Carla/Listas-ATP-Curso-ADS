import java.util.*;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int soma=0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 0) {
                    mat[i][j] += 1;
                }
            }
        }

        /*System.out.println("Matriz Original");        Impressão de matriz para conferência
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("\t" + mat[i][j]);
            }
            System.out.println("\n");
        }*/

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i < j) {
                    soma += mat[i] [j];
                }
            }
        }
        System.out.println("Soma: "+soma);
        sc.close();
    }
}