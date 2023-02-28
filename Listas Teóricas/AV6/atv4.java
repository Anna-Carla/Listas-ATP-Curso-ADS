import java.util.*;
public class atv4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, n;
       
        System.out.println("Número: ");
        k = sc.nextInt();
        System.out.println("Expoente: ");
        n = sc.nextInt();
        n=n+1; //gambiarra
        sc.close();
       
        System.out.println("Soma: "+ potenciacao(k,n));
       
       }
       public static int potenciacao(int k, int n){
           if(n==1){
               return 1;
           }
           return k * potenciacao(k, n - 1);
       }
    }