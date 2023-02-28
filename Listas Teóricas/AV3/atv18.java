import java.util.*;
public class atv18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtnum, num, maiornum=0, cont=0, x=0;

        System.out.println("Quantidade de números: ");
        qtnum = sc.nextInt();

        while(x<qtnum){
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if(num==maiornum){
                cont++;
            } else if (num>maiornum){
                maiornum = num;
                cont=1;
            }
            x++;
        }
        sc.close();
        System.out.println("O maior número é: "+maiornum+" que foi digitado "+cont+" vezes");
    }
}