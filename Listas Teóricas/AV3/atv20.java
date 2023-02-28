import java.util.*;
public class atv20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0, dados=-1, contpar=-1;

        while(num!=1000){
            System.out.println("Insira um número: ");
            num = sc.nextInt();
            if(num%2==0){
                System.out.println("Esse número é par!");
                contpar++;
            }
            dados++;
        }
        sc.close();
        System.out.println("Pares: "+contpar+"\nNúmeros digitados "+dados);
    }
}