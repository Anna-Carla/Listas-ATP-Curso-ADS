import java.io.*;
import java.util.*;
public class atv5{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        char caracter;
        File arq = new File ("arq.txt");
        FileReader leitor = new FileReader(arq);
        System.out.println("Digite o caracter a ser encontrado: ");
        caracter = sc.next().charAt(0);
        try {
            BufferedReader bufferedReader = new
            BufferedReader(leitor);
            String linha = "";

            while ( ( linha = bufferedReader.readLine() ) != null) {
                for (int i = 0; i < linha.length(); i++) { //conta as vogais
                        if(linha.charAt(i)==caracter){
                            cont++;
                        }
                }
                }
                leitor.close();
                bufferedReader.close();
                } 
                catch (IOException e) {
                e.printStackTrace();
                }
                System.out.println("Quantidade de "+caracter+" :"+cont);
        sc.close();
    }
}
