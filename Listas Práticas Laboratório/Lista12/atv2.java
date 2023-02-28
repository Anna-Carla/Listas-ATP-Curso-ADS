import java.util.*;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, c;
        System.out.print("Digite a escala da matriz: ");
        System.out.println("Linhas");
        l = sc.nextInt();
        System.out.println("Colunas");
        c = sc.nextInt();

        int[][] mat = new int[l][c];
        int[][] transposta = new int[l][c];

        System.out.println("Preencha matriz");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
                transposta[i][j] = mat[j][i];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                transposta[i][j] = mat[j][i];
            }
        }

        sc.close();

        /*for (int i = 0; i < mat.length; i++) { // imprimir matriz
            for (int j = 0; j < mat.length; j++) {
                System.out.print("\t" + mat[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println("\n"); // espaçamento das impressões

        for (int i = 0; i < mat.length; i++) { // imprimir matriz
            for (int j = 0; j < mat.length; j++) {
                System.out.print("\t" + transposta[i][j]);
            }
            System.out.println("\n");
        }*/

    }
}
