import java.util.*;
public class atv4{
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            String [] names = new String [5];
            String newnames;
            char opcao;
            int cont=0;
            for (int i = 0; i < names.length; i++) {
                System.out.print("Nome: ");
                    names[i] = sc.next();
                    cont++;
                if (i!=names.length-1) {
                System.out.println("Adicionar um nome? (Sim/Não)");
                    opcao = sc.next().charAt(0);
                    if(opcao!='s' && opcao!='S') {
                        i+=5;
                    }
                }
            }
            System.out.println("Qual nome quer buscar? ");
                newnames = sc.next();
            for (int i = 0; i < cont; i++) {
                if(names[i].indexOf(newnames)!=-1) {
                    System.out.print(names[i]+" - posição: "+i);
                }
            }
            sc.close();
        }
    }
