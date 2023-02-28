import java.io.*;
import java.util.*;
public class atv1{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String entrada="null";

        File arq = new File ("arq.txt");
        if (!arq.isFile()){
            arq.createNewFile();
            System.out.println("Novo arquivo vazio foi criado");
        } else {
            System.out.println("O objeto arq faz referência a um arquivo existente.");
        }
        FileWriter escritor = new FileWriter (arq,  true);

        while(entrada.indexOf("0")==-1){
            System.out.print("Digite: ");
            entrada = sc.next();
            escritor.write(entrada); 
        }
        escritor.close();
        FileReader leitor = new FileReader(arq);

        try {
            BufferedReader bufferedReader = new
            BufferedReader(leitor);
            String linha = "";

            while ( ( linha = bufferedReader.readLine() ) != null) {
                System.out.println(linha);
                }
                leitor.close();
                bufferedReader.close();
                } 
                catch (IOException e) {
                e.printStackTrace();
                }
        sc.close();
    }
}
