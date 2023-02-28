import java.util.*;
public class atv9{
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
        ordCresPar(n-2);
        System.out.print(" "+n);
    }
}
}