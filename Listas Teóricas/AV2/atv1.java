import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2;

        System.out.println("Insira 2 números: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        sc.close();
        if(n1>n2){
            System.out.println("O maior número é: "+n1);
        } else{
            System.out.println("O maior número é: "+n2);
        }
    }
}