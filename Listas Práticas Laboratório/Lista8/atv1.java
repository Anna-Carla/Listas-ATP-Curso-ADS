import java.util.*;
public class atv1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;

        System.out.println("Valor 1: ");
        n1 = sc.nextInt();
        System.out.println("Valor 2: ");
        n2 = sc.nextInt();
        sc.close();

        System.out.println("Soma: "+soma(n1, n2));
    } 
    public static double soma(double n1, double n2){
        double soma=0;
        while(n1<=n2){
            soma+= n1;
            n1++;
        }
        return soma;
    }        
}