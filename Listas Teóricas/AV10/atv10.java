import java.io.*;
import java.util.*;
public class atv10 {
    public static void main(String[] args)  throws IOException  {
        Scanner sc = new Scanner(System.in);
        String conteudo="";

        System.out.println("Digite a palavra: ");
            String palavra = sc.next();
            sc.close();

        File arq = new File ("arq.txt");

        if (arq.exists()) {
            System.out.println("Palavras informadas no arquivo existente "+qntPalavras(arq, palavra));
        } else {
            arq.createNewFile();
            System.out.println("Criando novo arquivo.");
            FileWriter escritor = new FileWriter (arq);
            System.out.print("Deseja digitar um conteudo? (sim/não) ");
            char opcao = sc.next().charAt(0);
            if (opcao == 's' || opcao == 'S') {
                System.out.print("Digite 0 para parar");
                while (!conteudo.contains("0")) {
                    conteudo = sc.nextLine();
                    escritor.write(conteudo);
                }
            }
            System.out.println("Palavras informadas no arquivo "+qntPalavras(arq, palavra));
            escritor.close();
        }
    }
    public static int qntPalavras(File arq, String palavra) throws IOException {
        int quantidade=0;
        String texto="";
        try {
            FileReader leitor = new FileReader (arq);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                texto+=linha;
            }
                leitor.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        texto = texto.replace(palavra, "0");
            for (int i = 0; i < texto.length(); i++) {
                if(texto.charAt(i)=='0') {
                    quantidade++;
                }
            }
        return quantidade;
    }
}