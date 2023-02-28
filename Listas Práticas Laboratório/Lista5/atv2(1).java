import java.util.*;
public class atv2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float harmonico=0;
        int n;

        System.out.println("Digite um número: ");
        n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            harmonico += (float)1/i;
        }
        System.out.println("O valor H é: "+harmonico);

    }
}    