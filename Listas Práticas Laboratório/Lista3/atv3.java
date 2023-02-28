import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, média;

        System.out.println("Insira a nota da prova 1: ");
        n1 = sc.nextFloat();
        System.out.println("Insira a nota da prova 2: ");
        n2 = sc.nextFloat();
        System.out.println("Insira a nota da prova 3: ");
        n3 = sc.nextFloat();
        sc.close();

        média = ((n1+n2)+(n3*2))/4;

        System.out.println("Sua média é: "+média);
        if(média>=60){
            System.out.println("Você foi aprovado");;
        } else{
            System.out.println("Você foi reprovado");
        }
    }
}