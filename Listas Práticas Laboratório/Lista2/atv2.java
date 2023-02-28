import java.util.*;
public class atv2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  nome, sx, civil;
        int anos;

        System.out.println("Insira seu nome: ");
        nome = sc.nextLine();
        System.out.println("Insira seu sexo (F ou M): ");
        sx = sc.nextLine();
        System.out.println("Insira seu estado civil (CASADA ou SOLTEIRA): ");
        civil = sc.nextLine();
       

        if(sx.equals("F") && civil.equals("CASADA")){
            System.out.println("Insira os anos de casada: ");
            anos = sc.nextInt();
      
        }
        sc.close();
        }
    }