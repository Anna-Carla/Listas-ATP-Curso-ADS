import java.util.*;
public class atv7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=3;
    int [] vetA = new int[n];
    int [] vetB = new int[n];
    int [] vetC = new int[n];

    System.out.println("Valores A");
    for (int i = 0; i < vetC.length; i++) {
        vetA[i] = sc.nextInt();
    }
    System.out.println("Valores B");
    for (int i = 0; i < vetC.length; i++) {
        vetB[i] = sc.nextInt();
    }

    for (int i = 0; i < vetC.length; i++) {
        vetC[i] = vetA[i]-vetB[i];
        System.out.println("Resultado: "+vetC[i]);
    }
    sc.close();
}
}
