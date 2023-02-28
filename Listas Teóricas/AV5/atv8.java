import java.util.*;
    public class atv8{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Insira um número: ");
        num = sc.nextInt();
        sc.close();

        if(num>0){
          System.out.println("Soma: "+soma(num));  
        } else{
            System.out.println("Número Inválido");
        }
    }
    public static int soma(int num){
        int soma=0;
        while(num!=0){ //Retira um algarismo e soma
            soma+= num%10;
            num = num/10;
        }
        return soma;
    }
}