import java.util.Scanner;

public class atv9 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x=1, cont=1;

    n = sc.nextInt();
    while(cont<=n){
        System.out.print("\t"+x);
        x+=2;
        cont++;
    }
    sc.close();
   } 
}
