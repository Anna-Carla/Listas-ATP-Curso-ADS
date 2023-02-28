import java.util.*;
public class atv3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num; 
    
    System.out.println("Digite um número: ");
    num = sc.nextInt();
    sc.close();

    if(verificador(num)==true){
        System.out.println("O número é par");
    } else{
        System.out.println("O número é impar");
    }
        
    }

    public static boolean verificador(int num){
        boolean par = true;
        if(num%2!=0){
            return false;
        }
        return par;
    }
}

