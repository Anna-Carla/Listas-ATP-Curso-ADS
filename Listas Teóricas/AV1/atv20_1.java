import java.util.*;
public class atv20_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double vprod, vdesc, vparc, c;
        String resposta;

        System.out.println("Insira o valor do produto: ");
        vprod = sc.nextDouble();
        vdesc = vprod - (vprod*0.1);
        vparc = vprod/3;
        c = vprod*0.05;

        System.out.println("A venda é parcelada? Sim ou Não?: ");
        resposta = sc.nextLine();
        while (!resposta.equals("Sim") && !resposta.equals("Nao")) {
            System.out.print(resposta);
            resposta = sc.nextLine();
             }
             sc.close();

        if (resposta.equals("Sim")){
            System.out.printf("Valor da parcela: "+vparc+" reais"+ "\nComissão: "+c+" reais");
        } else {
            System.out.println("Valor á vista: "+vdesc); 
        }
    }
}

    