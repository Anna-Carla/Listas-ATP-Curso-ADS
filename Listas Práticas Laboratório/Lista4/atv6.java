import java.util.*;
public class atv6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float num=1, par=-1, imp=0, soma=0, soma1=0, mediapar, mediag;
    // par é igual a -1 para não contar o 0 como número par
    while(num!=0){ 
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        if(num%2==0){
            soma = num+soma;
            par++;
        } else if(num%2!=0){
            soma1 = num+soma1;
            imp++;
        }
    }
   mediapar = soma/par;
   mediag = (soma+soma1)/(par+imp);
   sc.close();
   System.out.println("Números pares: "+par+"\nNúmeros impares: "+imp+"\nMédia de pares: "+mediapar+
   "\nMédia geral: "+mediag);
}
}