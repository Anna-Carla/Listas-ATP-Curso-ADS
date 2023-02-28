import java.util.*;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, c;
        System.out.print("Digite a escala da matriz: ");
        System.out.println("Linhas");
        l = sc.nextInt();
        System.out.println("Colunas");
        c = sc.nextInt();

        int [] [] mat1 = new int [l] [c];
        int [] [] mat2 = new int [l] [c];
        int [] [] matsoma = new int [l] [c];

        System.out.println("Matriz 1");
        for (int i = 0; i < mat1.length; i++) { //matriz 1
            for (int j = 0; j < mat1.length; j++) {
                mat1 [i] [j] = sc.nextInt();
            }
        }

        System.out.println("Matriz 2");
        for (int i = 0; i < mat2.length; i++) { //matriz 2
            for (int j = 0; j < mat2.length; j++) {
                mat2 [i] [j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat2.length; i++) { //matriz de soma
            for (int j = 0; j < mat2.length; j++) {
                matsoma [i] [j] = mat1 [i] [j] + mat2 [i] [j];
            }
        }
        sc.close();

/*      System.out.println("\n"); //espaçamento das impressões
        for (int i = 0; i < mat1.length; i++) { //imprimir matriz
            for (int j = 0; j < mat1.length; j++) {
            System.out.print("\t" + mat1[i][j]);
            }
            System.out.println("\n");
            }

            System.out.println("\n"); //espaçamento das impressões

        for (int i = 0; i < mat2.length; i++) { //imprimir matriz
            for (int j = 0; j < mat2.length; j++) {
            System.out.print("\t" + mat2[i][j]);
            }
            System.out.println("\n");
            }

         System.out.println("\n"); //espaçamento das impressões

        System.out.println("Matriz Resultado\n");
        for (int i = 0; i < matsoma.length; i++) { //imprimir matriz
            for (int j = 0; j < matsoma.length; j++) {
            System.out.print("\t" + matsoma[i][j]);
            }
            System.out.println("\n");
            }
*/
        }
    }
