import java.util.*;
public class atv8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Valor: ");
        n = sc.nextInt();
        sc.close();

        ordCres(n);

    }
    public static void ordCres(int n){
        if(n>-1 && n>=0){
        System.out.print(" "+n);
        ordCres(n-1);
    }
}
}