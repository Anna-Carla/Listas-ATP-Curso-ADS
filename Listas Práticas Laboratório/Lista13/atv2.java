import java.util.*;
public class atv2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] [] mat = new int [10] [15    ];
    int somalinha=0, somacoluna=0;

    for (int i = 0; i < mat.length; i++) { //alimentando a matriz
        for (int j = 0; j < mat[0].length; j++) {
            mat [i] [j] = sc.nextInt();
            somalinha += mat [i] [j];
        }
        if(somalinha%2==0){
            System.out.println("Linha "+i+" é par");
        } else{
            System.out.println("Linha "+i+" é impar");
        }
        somalinha = 0;
    }

    System.out.println("\n");
    sc.close();
    for (int i = 0; i < mat[0].length; i++) {
        for (int j = 0; j < mat.length; j++) {
            somacoluna += mat [j] [i];
            //System.out.println(somacoluna);
        }
        if(somacoluna%2==0){
            System.out.println("Coluna "+i+" é par");
        } else{
            System.out.println("Coluna "+i+" é impar");
        }
        somacoluna = 0;
    }   
    }
}