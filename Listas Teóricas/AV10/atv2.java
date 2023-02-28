import java.io.*;
import java.util.*;
public class atv2{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        File arq = new File ("arq.txt");

        FileReader leitor = new FileReader(arq);

        try {
            BufferedReader bufferedReader = new
            BufferedReader(leitor);
            String linha = "";

            while ( ( linha = bufferedReader.readLine() ) != null) {
                cont++;
                }
                leitor.close();
                bufferedReader.close();
                } 
                catch (IOException e) {
                e.printStackTrace();
                }
                System.out.println("Quantidade de linhas: "+cont);
        sc.close();
    }
}
