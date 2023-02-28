import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num, a=0, b=1, c=1, conta, soma1=0, soma2=0, soma3=0, sinal=1;

        System.out.println("Digite um número: ");
        num = sc.nextFloat();
        sc.close();
        conta= (2*num)-1;
        while(a<=num){
            soma1 = soma1+a;
            a++;
        } while(b<=conta){
            soma2 = sinal*b;
            sinal = -sinal;
            b++;
        } while(c<=conta){
            soma3 = soma3+c;
            c+=2;
        }
        
        System.out.println("Sequência 1: "+soma1+"\nSequência 2: "+soma2+"\nSequência 3: "+soma3);
    }
}
