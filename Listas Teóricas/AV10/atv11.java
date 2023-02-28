import java.io.*;
import java.util.*;
public class atv11 {
    public static void main(String[] args)  throws IOException  {
        Scanner sc = new Scanner(System.in);
        String conteudo="";

        System.out.print("Nomeie o txt: ");
        String path = sc.nextLine();

        File arq = new File(path);

        if (arq.exists()) {
            System.out.println("Arquivo existe.");
            qntPalavras(arq);
        } else {
            arq.createNewFile();
            System.out.println("Arquivo criado");
            FileWriter escritor = new FileWriter (arq);
            System.out.println("Arquivo criado");
            System.out.print("Deseja digitar um conteudo? (sim/não)");
                char opcao = sc.next().charAt(0);
                if (opcao == 's' || opcao == 'S') {
                    System.out.print("Digite 0 para encerrar");
                    while (!conteudo.contains("0")) {
                        conteudo = sc.nextLine();
                        escritor.write(conteudo);
                    }
                }
            escritor.close();
            qntPalavras(arq);
            sc.close();
        }
    }
    public static void qntPalavras(File arq) throws IOException {
        int qntLinhas=0;
        int qntPalavras=0;

        String texto="";
        try {
            FileReader leitor = new FileReader (arq);
            BufferedReader bufferedReader = new BufferedReader(leitor);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                qntPalavras++;
                texto+=linha;
                qntLinhas++;
                for (int j = 1; j < linha.length(); j++) {
                    if(linha.charAt(j)=='\n' || (linha.charAt(j-1)==' ' && linha.charAt(j)!='\n')) {
                        qntPalavras++;
                    }
                }

            }
                leitor.close();
                bufferedReader.close();
            } catch (IOException e ) {
                e.printStackTrace();
            }
        System.out.println("Dados do Arquivo: ");
        System.out.print("Linhas: "+qntLinhas+"\nCaracteres: "+texto.length()+"\nPalavras: "+qntPalavras);
    }
}