import java.util.*;
public class atv16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, m;

        System.out.println("Insira 2 notas: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        sc.close();
        m = (n1+n2)/2;

        if(n1>=0.0 && n1<=10.0 && n2>=0.0 && n2<=10.0){
            System.out.println("A média é: "+m);
        } else{
            System.out.println("Valor inválido");
        }
    }
}