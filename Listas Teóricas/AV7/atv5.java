import java.util.*;
public class atv5{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int par=0;
    int [] vet = new int[10];

    for(int i=0; i<vet.length; i++){
        vet[i] = sc.nextInt();
        if(vet[i]%2==0){
            par++;
        }
    }
    sc.close();
    System.out.println("Quantidade Pares: "+par);
}
}