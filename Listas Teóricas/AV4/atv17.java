import java.util.*;
public class atv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opção=1;
        float num1, num2;
        
        while(opção!=5){
        System.out.println("\nMenu de Opções");
        System.out.println("1-Adição \n2-Subtração \n3-Multiplicação \n4-Divisão \n5-Sair");
        System.out.print("Digite uma opção: ");
        opção = sc.nextInt();
        System.out.println("1º Número: ");
        num1 = sc.nextFloat();
        System.out.println("2º Número: ");
        num2 = sc.nextFloat();

        switch(opção){
            case 1:
            System.out.println("Resultado: "+(num1+num2));
            break;
            case 2:
            System.out.println("Resultado: "+(num1-num2));
            break;
            case 3:
            System.out.println("Resultado: "+(num1*num2));
            break;
            case 4:
            System.out.println("Resultado: "+(num1/num2));
            break;
            case 5:
            System.out.println("Você saiu!");
            break;
            default:
            System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}