import java.util.*;
public class atv10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Valor: ");
        n = sc.nextInt();
        sc.close();

        ordCresPar(n);

    }
    public static void ordCresPar(int n){
        if(n>-1 && n>=0 && n%2==0){
        System.out.print(" "+n);
        ordCresPar(n-2);
    }
}
}