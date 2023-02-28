import java.util.*;
public class atv3{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n;

 System.out.println("Insira um número: ");
 n = sc.nextInt();
 sc.close();

 System.out.println("Soma: "+ somaCubo(n));

}
public static int somaCubo(int n){
    if(n==1){
        return 1;
    }
    return n*n*n + somaCubo(n - 1);
}
}