
public class atv1{
    public static void main(String[] args) {
    int soma;
    int []vet = {1,0,5,-2,-5,7};
    soma = vet[0]+vet[1]+vet[5];
    System.out.println("Soma [0], [1] e [5]" +soma);
    vet [4]=100;

    for(int i=0; i<6; i++){
        System.out.println(vet[i]);
    }
    }
}