import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num=0, x=0, soma=0, média;

        while(x<10){
            System.out.println("Digite um número: ");
            num = sc.nextFloat();
            if(num>0){
                soma = num+soma;
                x++;
            }
        } 
        média = soma/10;
        System.out.println("A média é: "+média);
        sc.close();     
    } 
}