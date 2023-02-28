import java.util.*;
public class atv2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1="", s2, caracter, c1, resultado;
        char c2;
        int opcao, cont=0, posição=0, posi=0, tamanho=0;

        System.out.println("Digite o S1: ");
        s1 = sc.nextLine();
        while(s1.length()>20){
            System.out.println("Digite valor menor");
            s1 = sc.nextLine();
            }
        System.out.print("Opção: ");
        opcao = sc.nextInt();

        switch(opcao){
            case 1:
            System.out.println("Tamanho da s1: "+(s1.length()));
            break;
            case 2:
            System.out.println("Digite o S2: ");
            s2 = sc.nextLine();

            if(s1.compareTo(s2)==0){
                System.out.println("São iguais");
            } else{
                System.out.println("São diferentes");
            }
            break;
            case 3:
            System.out.println("Digite o S2: ");
            s2 = sc.nextLine();
            System.out.println("Concatenação: "+s1+s2);
            break;
            case 4:
            char [] reverse = s1.toCharArray();
            for (int i = reverse.length-1; i >=0 ; i--) {
                System.out.println(reverse[i]);
            }
            break;
            case 5:
            System.out.println("Digite um caracter para comparação: ");
            caracter = sc.nextLine();
            s1 = s1.replace(caracter, "0");
            for (int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i)=='0'){
                    cont++;                
            }
            System.out.println("Vezes de caracter: "+cont);
            }
        break;
        case 6:
            System.out.print("Caracter C1:");
            c1 = sc.next();
            System.out.print("Substituir por C2: ");
            c2 = sc.next().charAt(0);
            posição = s1.indexOf(c1);
            char [] s1_string = s1.toCharArray();
            s1_string[posição] = c2;
            resultado = String.valueOf(s1_string);
            System.out.println(resultado);
        break;
        case 7:
        System.out.println("Valor S2: ");
        s2 = sc.next();
        posição = s1.indexOf(s2);
        if(posição==-1){
            System.out.println("Não é substring");
        } else{
            System.out.println("É uma substring");
        }
        break;
        case 8:
        System.out.println("Posição de início");
        posi = sc.nextInt();
        posição = s1.indexOf(posi);
        System.out.println("Tamanho da substring");
        tamanho = sc.nextInt();
        s1 = s1.substring(posi, tamanho+posi); //goiaba
        System.out.println(s1);
    }
    sc.close();
    }
}
