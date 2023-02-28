import java.util.Scanner;

public class atv17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x=1, soma=0;  

    n = sc.nextInt();
    sc.close();

     while(x<=n){
        soma = x+soma;
        x++;
     }
     System.out.println(soma);
    }
}
