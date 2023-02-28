import java.util.*;
public class atv1{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n;

 System.out.println("Insira um número: ");
 n = sc.nextInt();
 sc.close();

 System.out.println("Soma: "+ soma(n));

}
public static int soma(int n){
    if(n==1){
        return 1;
    }
    return n + soma(n - 1);
}
}