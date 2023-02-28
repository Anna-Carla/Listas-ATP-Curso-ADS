public class atv10 {
    public static void main(String[] args) {
        int prod;
        int mat[][] = new int[4][4];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                    prod = i*j; //produto de linha e coluna
                    mat[i][j] = prod;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}