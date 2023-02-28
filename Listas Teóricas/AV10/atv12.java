import java.io.*;
import java.util.*;
public class atv12 {
    public static void main(String[] args)  throws IOException  {
        Scanner sc = new Scanner(System.in);
        String nome="", numero_tel="";

        while(!numero_tel.equals("0")) {
            System.out.print("Digite o nome: ");
                nome=sc.nextLine();
            System.out.print("Digite o número de telefone: ");
                numero_tel=sc.nextLine();
            escreveArq(nome, numero_tel);
        }
        sc.close();
    }
    public static void escreveArq (String nome, String numero_tel)  throws IOException  {
        File arq = new File("numerosDeTelefone.txt");

        if(!arq.exists()) {
            arq.createNewFile();
        }

        FileWriter escritor = new FileWriter(arq, true);
            escritor.append(nome+"\t"+numero_tel+"\n");
            escritor.close();
    }
}