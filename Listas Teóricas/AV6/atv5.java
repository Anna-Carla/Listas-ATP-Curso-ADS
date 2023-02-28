import java.util.*;
public class atv5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Valor: ");
        n = sc.nextInt();
        sc.close();

        System.out.println("Fibonacci: "+fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }
        return  fibonacci(n - 1) + fibonacci(n - 2);
    }
}