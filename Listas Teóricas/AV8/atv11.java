import java.util.*;
public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior=0, linha=0, coluna=0;
        int mat[][] = new int[3][3];

        System.out.println("Valores: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
                if(maior==0){
                    maior = mat[i][j];
                } if(mat[i][j]>maior){
                    maior = mat[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        sc.close();
        System.out.println("Maior valor: "+maior+"\nLocalização \nLinha: "+linha+"\nColuna: "+coluna);
    }
}