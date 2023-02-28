import java.util.*;
public class atv3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Número: ");
        n = sc.nextInt();
        sc.close();
        
        System.out.println("Fatorial: "+fatorial(n));

    }
    public static int fatorial(int n){
        int fat=1;
        for(int i=1; i<=n; i++){
            fat*= i;
        }
        return fat;
    }
}