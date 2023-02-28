import java.util.*;
public class atv4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vet = new int[10];
    int num;

    System.out.println("Números: ");
    for (int i = 0; i < vet.length; i++) {
        vet[i] = sc.nextInt();
    }
    System.out.println("Número:");
    num = sc.nextInt();

    for (int i = 0; i < vet.length; i++) {
        if(vet[i]%num==0){
            System.out.println(vet[i]+" é multiplo");
        }
    }
    sc.close();
    }
}
