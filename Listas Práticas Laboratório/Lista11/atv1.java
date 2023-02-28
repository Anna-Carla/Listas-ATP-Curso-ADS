import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] mat = new int[4][4];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = rd.nextInt(20);
                if (mat[i][j] == 0) {
                    mat[i][j] += 1;
                }
            }
        }

        System.out.println("Matriz Original");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("\t" + mat[i][j]);
            }
            System.out.println("\n");
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i < j) {
                    mat[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz Transformada");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("\t" + mat[i][j]);
            }
            System.out.println("\n");
        };
    }
}