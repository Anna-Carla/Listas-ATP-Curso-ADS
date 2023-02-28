import java.util.*;
public class atv4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Digite um número");
    num = sc.nextInt();
    sc.close();

    System.out.println("Fatorial: "+fatorial(num));
    }

    public static int fatorial(int num){
        if(num==1){
            return 1;
        }
        return num * fatorial(num-1);
    }
}