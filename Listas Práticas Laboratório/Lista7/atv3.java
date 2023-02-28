import java.util.*;

public class atv3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, cont=1;

    System.out.println("Insira um número: ");
    num = sc.nextInt();
    sc.close();

    for(int i=1; i<=num; i++){
        for(int x=0; x<=i; x++){
            if(x==i){
                System.out.println("\n");
            } else{
            System.out.print(cont+" ");
            cont++;
            }
            }
        }
    }
}