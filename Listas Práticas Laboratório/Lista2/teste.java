import java.util.*;
public class teste {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String nome, sexo, estadociv;
            int anos;
            System.out.println("Escreva seu nome:");
            nome = sc.nextLine();
            System.out.println("Inserir sexo sendo (F)eminino/(M)asculino:");
            sexo = sc.nextLine();
            System.out.println("Inserir estado civil sendo (C)asada/(S)olteira");
            estadociv = sc.nextLine();
            if (sexo.equals("F") && estadociv.equals("C")) {
                System.out.println("Insira o tempo de casada:");
                anos = sc.nextInt();
            }
            sc.close();
        }
    }