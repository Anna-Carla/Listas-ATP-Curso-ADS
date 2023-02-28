import java.util.*;
public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, média;

        System.out.println("Insira a nota do trabalho de laboratório: ");
        n1 = sc.nextFloat();
        System.out.println("Insira a nota da avaliação semestral: ");
        n2 = sc.nextFloat();
        System.out.println("Insira a nota do exame final: ");
        n3 = sc.nextFloat();
        sc.close();
        média = ((n1*2)+(n2*3)+(n3*5))/10;
        if(média>=0 && média<=2.9){
            System.out.println("Reprovado");
        } else if(média>=3 && média<=4.9){
            System.out.println("Recuperação");
        } else{
            System.out.println("Aprovado");
        }
    }
}