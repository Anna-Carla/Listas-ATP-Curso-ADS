import java.util.*;
public class atv1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = sc.nextInt();
        sc.close();
        while (!(num%11==0 || num%13==0 || num%17==0)){
            num++;
        }
        System.out.println("Primeiro múltiplo: "+num);
    }
}
