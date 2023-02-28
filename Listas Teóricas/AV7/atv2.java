import java.util.*;
public class atv2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vet = new int[6];
    System.out.println("Insira os valores:");
    for(int i=0; i<vet.length; i++){
        vet[i] = sc.nextInt();
    }
    for(int i=0; i<vet.length; i++){
        System.out.println(vet[i]);
    }
    sc.close();
}
}