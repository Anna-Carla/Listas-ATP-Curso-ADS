import java.util.*;
public class atv3{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double [] vet = new double[10];

    for (int i = 0; i < vet.length; i++) {
        vet[i] = sc.nextInt();
    }
    for (int i = vet.length-1 ; i >=0; i--) {
        System.out.print(" "+vet[i]);
    }
    sc.close();
}
}