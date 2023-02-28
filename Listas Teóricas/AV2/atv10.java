import java.util.*;
public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        double G, P, H, A;

        System.out.println("Digite 3 números:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        sc.close();

        G = Math.cbrt(x*y*z);
        P = x+2*y+3*z/6;
        H = 1/(1/x)+(1/y)+(1/z);
        A = (x+y+z)/1;

        System.out.println("Resultado: ");
        System.out.println("Geométrica: "+G+"\nPonderada: "+P+"\nHarmônica: "+H+"\nAritmética: "+A);
    }
}
