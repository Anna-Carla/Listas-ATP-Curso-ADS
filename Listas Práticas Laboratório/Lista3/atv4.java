import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2, calc;
        String op;
      
        System.out.println("Menu de operações: \n(a) Soma \n(b) Diferença \n(c) Produto  \n(d) Divisao");
        System.out.println("Digite a opção: ");
        op = sc.nextLine();

        System.out.println("Digite 2 números: ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        switch (op) {
            case "a":
                calc = num1 + num2;
                System.out.println("A soma dos números é: "+calc);
                break;
            case "b":
                if(num1>num2){
                    calc = num1-num2;
                    System.out.println("A diferença dos números é: "+calc);
                } else{
                    calc = num2-num1;
                    System.out.println("A diferença dos números é: "+calc);
                }
                break;
            case "c":
                calc = num1*num2;
                    System.out.println("O produto dos números é: "+calc);
                break;    
            case "d":
                if(num2!=0){
                    calc = num1/num2;
                    System.out.println("A divisão dos números: ");
                } else{
                    System.out.println("Não é possivél fazer a divisão");
                }  
                break;     
            default:
                System.out.println("Opção inválida!");
                break;
        }
        sc.close();
    }
}