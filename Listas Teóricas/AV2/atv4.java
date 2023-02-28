import java.util.*;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        
        System.out.println("Insira os valores de A, B e C: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        sc.close();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Os 3 lados formam um triângulo");
         if(b==c && a==b && c==a){
            System.out.println("É um triângulo equilátero");
         }else if(a!=c && a!=b && c!=b){
            System.out.println("É um triângulo Escaleno");
        } else{
            System.out.println("É um triângulo Isóseles");
        }
    }   
        else{
            System.out.println("Não é um triângulo");
          } 
    }
}
