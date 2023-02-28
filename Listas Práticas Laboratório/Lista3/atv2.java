import java.util.*;
    public class atv2{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double num, log;

            System.out.println("Insira um número: ");
            num = sc.nextDouble();
            sc.close();

            if(num>0){
               log = Math.log10(num);
               System.out.println("O logaritmo de: "+num+ " é: "+log);
            } else{
                System.out.println("Número inválido");
            }
        }
    }

