import java.util.*;
public class atv4{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vetx = new int[10];
    int [] vety = new int[10];
    int[] prod = new int[10];

    System.out.println("Vetor 1");
    for (int i = 0; i < vetx.length; i++) {
        vetx[i] = sc.nextInt();
    }
    System.out.println("Vetor 2");
    for (int i = 0; i < vety.length; i++) {
        vety[i] = sc.nextInt();
        prod [i] = vetx[i]*vety[i];
    }

    System.out.print("Produto: ");
    for (int i = 0; i < prod.length; i++) {
        System.out.print(prod[i]+" ");
    }
    sc.close();
}
}

