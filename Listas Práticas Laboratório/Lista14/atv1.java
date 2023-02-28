import java.util.*;
public class atv1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;
        String cadeiaA, cadeiaB;

        System.out.println("Cadeira A: ");
        cadeiaA = sc.nextLine();
        System.out.println("Cadeia B: ");
        cadeiaB = sc.nextLine();
        sc. close();

        cadeiaB = cadeiaB.replace(cadeiaA, "0");
        for (int i = 0; i < cadeiaB.length(); i++) {
            if(cadeiaB.charAt(i)=='0'){
                cont++;
            }
        } 
        System.out.println("Vezes de ocorrência: "+cont);
    }
}