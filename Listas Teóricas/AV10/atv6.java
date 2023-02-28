import java.io.*;
import java.util.*;
public class atv6{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        char [] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y','w', 'z'};
        File arq = new File ("arq.txt");
        FileReader leitor = new FileReader(arq);
        try {
            BufferedReader bufferedReader = new
            BufferedReader(leitor);
            String linha = "";

            while ( ( linha = bufferedReader.readLine() ) != null) {
                for (int j = 0; j < alfabeto.length; j++) {
                    for (int i = 0; i < linha.length(); i++) {
                        if(linha.charAt(i)==alfabeto[j]){
                            cont++;
                        }
                    }
                    System.out.println("Quantidade de "+alfabeto[j]+": "+cont);
                    cont = 0;
                }
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
