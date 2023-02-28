import java.util.*;
public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Insira a idade do nadador: ");
        idade = sc.nextInt();
        sc.close();

        if(idade<=5){
            System.out.println("Idade Inválida");    
        } else if(idade>=5 && idade<=7){
            System.out.println("Infantil A");
        } else if(idade>=8 && idade<=10){
            System.out.println("Infantil B");
        } else if(idade>=11 && idade<=13){
            System.out.println("Juvenil A");
        } else if(idade>14 && idade<=17){
            System.out.println("Juvenil B");
        } else{
            System.out.println("Maiores de 18 anos");
        }
    }
}


