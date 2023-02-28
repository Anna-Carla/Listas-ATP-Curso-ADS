import java.util.*;

public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        int mat[][] = new int[2][2];

        System.out.println("Valores: ");
        for (int i = 0; i < mat.length; i++) { // linha
            for (int j = 0; j < mat.length; j++) { // coluna
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Valor a ser encontrado: ");
        valor = sc.nextInt();
        sc.close();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == valor) {
                    System.out.println("Localização\nLinha: " + i + "\nColuna: " + j);
                    break;
                } else if (valor != mat[i][j] && i == mat.length-1 && j == mat.length-1) { // não funciona essa porra!
                    System.out.println("Não encontrado");
                }
            }
        }
    }
}

/*
 * Leia uma matriz 5 x 5. Leia tamb em um valor X. O programa dever ́a fazer uma
 * busca desse valor na
 * matriz e, ao final, escrever a localizacao (linha e coluna) ou uma mensagem
 * de nao encontrado
 */