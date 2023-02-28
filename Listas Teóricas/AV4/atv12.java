import java.util.*;
public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double num=1, quad, cub, raiz;

        while(num>0){
            System.out.println("Digite um número: ");
            num = sc.nextDouble();

            quad = num*num;
            cub = num*num*num;
            raiz = Math.sqrt(num);
            System.out.println("Quadrado: "+quad+"\nCubo: "+cub+"\nRaiz quadrada: "+raiz+"\n");
        }
        sc.close();
    }
}