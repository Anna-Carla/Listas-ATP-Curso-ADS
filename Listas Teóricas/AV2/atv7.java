/* */

import java.util.*;
public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, taxa;
        String estado;

        System.out.println("Digite o valor: ");
        valor = sc.nextDouble();
        System.out.println("Digite o estado (MG,SP,RJ OU MS): ");
        estado = sc.next();
        sc.close();

        switch(estado){
            case "MG":
                taxa = valor+(valor*0.07);
                System.out.println("Preço final: "+taxa);
                break;
            case "SP":
                taxa = valor+(valor*0.12);
                System.out.println("Preço final: "+taxa);
                break;
            case "RJ":
                taxa = valor+(valor*0.15);
                System.out.println("Preço final: "+taxa);
                break;
            case "MS":
                taxa = valor+(valor*0.08);
                System.out.println("Preço final: "+taxa);
                break;
            default:
            System.out.println("Erro!");
            break;    
        }
    }
}
        
        