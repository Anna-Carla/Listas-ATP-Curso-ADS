import java.util.*;
public class atv2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;

        System.out.println("Valor 1: ");
        n1 = sc.nextInt();
        System.out.println("Valor 2: ");
        n2 = sc.nextInt();
        sc.close();
        
        System.out.println("Resultado: "+exp(n1, n2));
    }
    public static double exp(double n1, double n2){
        double exp=1;
        for(int i=1; i<=n2; i++){
            exp*= n1;
        }
        return exp;
    }
}