import java.util.*;

public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite o parâmtro do desenho: ");
        num = sc.nextInt();
        sc.close();

        DesenhaLinha(num);
    }
    public static void DesenhaLinha(int num){
        for(int i=0; i<num; i++){
            System.out.print("=");
        }
    }
}