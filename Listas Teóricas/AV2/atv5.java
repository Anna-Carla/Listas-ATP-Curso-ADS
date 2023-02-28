/*Leia a idade e o tempo de servic¸o de um trabalhador e escreva se ele pode ou nao se aposentar. As ˜
condic¸oes para aposentadoria s ˜ ao: ˜
• Ter pelo menos 65 anos;
• Ou ter trabalhado pelo menos 30 anos;
• Ou ter pelo menos 60 anos e trabalhando pelo menos 25 anos;*/

import java.util.*;
public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, tserv;

        System.out.println("Insira sua idade: ");
        idade = sc.nextInt();
        System.out.println("Insira seu tempo de serviço: ");
        tserv = sc.nextInt();
        sc.close();

        if(idade>=65){
            System.out.println("Pode aposentar");
        }
         else if(tserv==30){
            System.out.println("Pode aposentar"); 
        }
        else if(idade<60 && tserv>=25){
            System.out.println("Pode aposentar");
        }
        else{
            System.out.println("Não pode aposentar");
        }
    }
}
