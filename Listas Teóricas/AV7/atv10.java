import java.util.*;
public class atv10{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int posit=0, neg=0;
    int [] vet = new int[10];

    System.out.println("Digite os valores");
    for(int i=0; i<vet.length; i++){
        vet[i] = sc.nextInt();
        if(vet[i]>0){
            posit += vet[i];
        } else if(vet[i]<0){
            neg++;
        }
    }
    sc.close();
    System.out.println("Qtd de negativos: "+neg+"\nSoma positivos: "+posit);
}
}