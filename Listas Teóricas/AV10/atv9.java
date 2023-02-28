import java.io.*;
import java.util.*;
public class atv9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String arqEntrada, arqSaida;

        System.out.print("Arquivo entrada: ");
            arqEntrada = sc.nextLine();

        System.out.print("Arquivo saída: ");
            arqSaida = sc.nextLine();

        File arq1 = new File(arqEntrada+".txt");
        if(arq1.exists()) {
            System.out.println("Leitura de dados.");

            File arq2 = new File(arqSaida+".txt");
            if(arq1.exists()) {
                System.out.println("Armazenando dados.");
            } else {
                System.out.println("Gerar novo arquivo");
                arq2.createNewFile();
            }

            leituraArq1(arq1, arq2);

        } else {
            System.out.println("Arquivo entrada não existe.");
        }
        sc.close();

    }

    public static void leituraArq1(File arq1, File arq2) throws IOException {

        FileWriter escritorMaisPopu = new FileWriter(arq2);

        int maiorPopulação=0;
        String populaçãoLinha="";
        String numeros="0123456789";
        int num, posIn=0, posTemp;
        String numTxt;

        try {
            FileReader leitor = new FileReader(arq1);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ((linha = bufferedReader.readLine()) != null) {
                    for (int j = 0; j < numeros.length(); j++) {
                            posTemp = linha.indexOf(numeros.charAt(j));
                        if (posTemp != -1) {posIn = linha.indexOf(numeros.charAt(j));}                      
                    }
                    numTxt = linha.substring(posIn, linha.length()); 
                    num = Integer.parseInt(numTxt);
                if(num>maiorPopulação) {
                    maiorPopulação = num;
                    populaçãoLinha = linha;
                }  
            }
            leitor.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        escritorMaisPopu.write(populaçãoLinha);

        escritorMaisPopu.close();
    }

}