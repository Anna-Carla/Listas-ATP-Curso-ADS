import java.io.*;
import java.util.*;
public class atv3{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char [] vogais = {'a','e','i','o','u'};
        int cont=0;
        File arq = new File ("arq.txt");

        FileReader leitor = new FileReader(arq);

        try {
            BufferedReader bufferedReader = new
            BufferedReader(leitor);
            String linha = "";

            while ( ( linha = bufferedReader.readLine() ) != null) {
                for (int i = 0; i < linha.length(); i++) {
                    for (int j = 0; j < vogais.length; j++) {
                        if(linha.charAt(i)==vogais[j]){
                            cont++;
                        }
                    }
                }
                }
                leitor.close();
                bufferedReader.close();
                } 
                catch (IOException e) {
                e.printStackTrace();
                }
                System.out.println("Quantidade de vogais: "+cont);
        sc.close();
    }
}
