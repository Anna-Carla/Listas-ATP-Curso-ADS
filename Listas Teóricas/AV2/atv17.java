import java.util.*;
public class atv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, d1, d2;

        System.out.println("Insira 2 números: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        sc.close();
        d1 = n1-n2;
        d2 = n2-n1;

        if(n1>n2){
            System.out.println("O maior número é: "+n1+"\nA diferença é: "+d1);
        } else{
            System.out.println("O maior número é: "+n2+"\nA diferença é: "+d2);
        }
    }
}