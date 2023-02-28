import java.util.*;
    public class atv1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num, soma=0;

            System.out.println("Digite um número: ");
            num = sc.nextInt();
            sc.close();

            if(num>0){
                while(num>0){
                    soma = soma+num%10;
                    num = num/10;
                }
                System.out.println("A soma dos algorismo é: "+soma);
            } else{
                System.out.println("Número inválido");
            }
        }
    }