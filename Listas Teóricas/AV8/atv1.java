import java.util.*;
public class atv1{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cont=0;
    int [] vet = new int[20];

    System.out.println("Valores: ");
    for (int i = 0; i < vet.length; i++) {
        vet [i] = sc.nextInt();
    }
    for (int i = 0; i < vet.length; i++) {
        for (int j = 0; j < vet.length; j++) {
            if(vet[i]==vet[j]){
                cont++;
            }
        }
        if(cont<2){
            System.out.println("Num: "+vet[i]);
        }
        cont=0;
    }
    sc.close();
    }
}