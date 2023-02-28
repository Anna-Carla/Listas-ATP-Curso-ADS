import java.util.*;
public class atv15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s, prest, emp; 

        System.out.println("Insira seu salário: ");
        s = sc.nextDouble();
        System.out.println("Insira o valor da prestação: ");
        prest = sc.nextDouble();
        sc.close();
        emp = s*0.2;
        if(prest>emp){
            System.out.println("Empréstimo não concedido");
        } else{
            System.out.println("Empréstimo concedido");
        }
    }
}
