import java.util.*;
public class atv2{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n;

 System.out.println("Insira um número: ");
 n = sc.nextInt();
 sc.close();

 System.out.println("Fatorial: "+ fatorial(n));

}
public static int fatorial(int n){
    if(n==1){
        return 1;
    }
    return n * fatorial(n - 1);
}
}