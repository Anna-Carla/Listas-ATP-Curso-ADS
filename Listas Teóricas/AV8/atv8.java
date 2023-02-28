import java.util.*;
public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        int mat[][] = new int [4][4];

        System.out.println("Valores");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
                if(mat[i][j]>10){
                    cont++;
                }
            }
        }
        System.out.print("Qtd de números maior que 10: "+cont);
        sc.close();
    }
}