import java.util.*;
public class atv3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data, posiçãodata, dia="null", mes="null", ano="null";
        int barra;

        System.out.println("Digite uma data (dd/mm/aaaa): ");
        data = sc.nextLine();

        posiçãodata = data; 

        barra = posiçãodata.indexOf("/"); // vai armazenar todas as barras
        if(dia.equals("null")){
            dia = posiçãodata.substring(0, barra); //vai armazernar o dia
        }
        posiçãodata = posiçãodata.substring(barra+1, posiçãodata.length()); // vai pegar a partir da primeira barra
        barra = posiçãodata.indexOf("/"); //vai armazenar a segunda barra com novo valor

        if(mes.equals("null")){
            mes = posiçãodata.substring(0, barra); //armazerna o mes
        }
        ano = posiçãodata.substring(barra+1, posiçãodata.length()); //pega os números após a barra até o final do vetor

        System.out.println("Dia: "+dia);
        System.out.println("Mes: "+mes);
        System.out.println("Ano: "+ano);
        sc.close();
    }
}

