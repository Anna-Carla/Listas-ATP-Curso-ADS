import java.io.*;
import java.util.*;
public class atv7{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nome1, nome2, conteudo="";

        System.out.println("Digite o nome do arquivo 1: ");
        nome1 = sc.next();
        File arq1 = new File (nome1+".txt");
        if (!arq1.isFile()){
            arq1.createNewFile();
            System.out.println("Novo arquivo vazio foi criado");
        } else {
            System.out.println("O objeto arq faz referência a um arquivo existente.");
        }
        FileReader leitor = new FileReader(arq1);
        System.out.println("Digite o nome do arquivo 2: ");
        nome2 = sc.next();
        File arq2 = new File (nome2+".txt");
        if (!arq2.isFile()){
            arq2.createNewFile();
            System.out.println("Novo arquivo vazio foi criado");
        } else {
            System.out.println("O objeto arq faz referência a um arquivo existente.");
        }
        FileWriter escritor2 = new FileWriter(arq2);
        try {
            BufferedReader bufferedReader = new
            BufferedReader(leitor);
            String linha = "";

            while ( ( linha = bufferedReader.readLine() ) != null) {
                conteudo += linha;
                }
                
                leitor.close();
                bufferedReader.close();
                } 
                catch (IOException e) {
                e.printStackTrace();
                }
                conteudo = conteudo.toUpperCase();
                escritor2.write(conteudo);
                escritor2.close();
        sc.close();
    }
}
