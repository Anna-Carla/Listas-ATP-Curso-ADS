import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, i, j;

        System.out.println("Insira um número: ");
        n = sc.nextInt();
        System.out.println("Insira o valor de i: ");
        i = sc.nextInt();
        System.out.println("Insira o valor de j: ");
        j = sc.nextInt();
        sc.close();
       
        for(int x=0; x<=n; x++){
            if(x%i==0 || x%j==0){
                System.out.print(x+" - ");
            }
            x++;
        }
    }
}