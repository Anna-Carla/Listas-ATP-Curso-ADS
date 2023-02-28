
import java.util.*;
public class atv6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Valor 1: ");
        n1 = sc.nextInt();
        System.out.println("Valor 2: ");
        n2 = sc.nextInt();
        sc.close();

        System.out.println("Multiplicação: "+ multipRec(n1, n2));
    }
    public static int multipRec(int n1, int n2){
        if(n2==0){
            return 0;
        }
        return n1+multipRec(n1, n2-1);

    }
    } 