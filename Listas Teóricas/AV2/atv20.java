import java.util.*;
public class atv20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, alt, imc;

        System.out.println("Insira seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Insira sua altura: ");
        alt = sc.nextDouble();
        sc.close();
        imc = peso/(alt*alt);
        
        if(imc<18.5){
            System.out.println("Abaixo do peso");
        } else if(imc>=18.6 && imc<=24.9){
            System.out.println("Saudável");
        } else if(imc>=25.0 && imc<=29.9){
            System.out.println("Peso em excesso");
        } else if(imc>=30.0 && imc<=34.9){
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)"); 
        }
    }
}
