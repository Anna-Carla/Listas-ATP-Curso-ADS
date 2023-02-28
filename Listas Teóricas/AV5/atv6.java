import java.util.*;
    public class atv6{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("1° Número: ");
        num1 = sc.nextInt();
        System.out.println("2° Número: ");
        num2 = sc.nextInt();
        sc.close();

        System.out.println("O maior número é: "+maior(num1, num2)); 
    }
    public static int maior(int num1, int num2){
        if(num1>num2){
            return num1;
        } else if(num1<num2){
            return num2;
        } else{
            return 0;
        }
    }
}