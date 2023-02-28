import java.util.*;
public class atv7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Valor: ");
        n = sc.nextInt();
        sc.close();

        ordCres(n);

    }
    public static void ordCres(int n){
        if(n>-1 && n>0){
        ordCres(n-1);
        System.out.print(" "+n);
    }
}
}