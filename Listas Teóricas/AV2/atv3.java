import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Insira um número: ");
        num = sc.nextInt();
        sc.close();
        if(num%3==0){
            System.out.println(num+" é divisível por 3");
        } else if (num%5==0){
            System.out.println(num+" é divisível por 5");
        } else if (num%3==0 && num%5==0){
            System.out.println(num+" é divisível por 3 e 5");
        } else{
            System.out.println("Número Inválido"); 
        }
    }
}