import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float b, B, a;
        
        System.out.println("Insira a base maior: ");
        B = sc.nextFloat();
        System.out.println("Insira a base menor: ");
        b = sc.nextFloat();
        sc.close();
        if(b>0 && B>0){
            a = (B+b)*2/2;
            System.out.println("A área do trapézio é: "+a);
        } else{
            System.out.println("Número inválido");
        
        }
    }
}


