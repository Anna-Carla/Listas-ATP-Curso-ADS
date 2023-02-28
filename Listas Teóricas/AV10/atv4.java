import java.io.*;
import java.util.*;
public class atv4{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char [] vogais = {'a','e','i','o','u'};
        char [] consoantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'y','w', 'z'};
        int cont=0, cont1=0;
        File arq = new File ("arq.txt");

        FileReader leitor = new FileReader(arq);

        try {
            BufferedReader bufferedReader = new
            BufferedReader(leitor);
            String linha = "";

            while ( ( linha = bufferedReader.readLine() ) != null) {
                for (int i = 0; i < linha.length(); i++) { //conta as vogais
                    for (int j = 0; j < vogais.length; j++) {
                        if(linha.charAt(i)==vogais[j]){
                            cont++;
                        }
                    }
                }
                for (int i = 0; i < linha.length(); i++) { //conta as consoantes
                    for (int j = 0; j < consoantes.length; j++) {
                        if(linha.charAt(i)==consoantes[j]){
                            cont1++;
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
                System.out.println("Quantidade de consoantes: "+cont1);
        sc.close();
    }
}
