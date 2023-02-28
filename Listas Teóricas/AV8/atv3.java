import java.util.*;
public class atv3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vet = new int[10];

    System.out.println("Valores: ");
    for (int i = 0; i < vet.length; i++) {
        vet[i] = sc.nextInt();
        if(vet[i]<0){
            vet[i]=0;
        }
    }
    for (int i = 0; i < vet.length; i++) {
        System.out.println(vet[i]);
    }
    sc.close();
    }
}