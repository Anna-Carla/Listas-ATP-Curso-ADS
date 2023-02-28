import java.util.*;
public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num=1, maior=-1, menor=0;

        while(num>0){
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            if(maior==-1){
                maior = num; menor=num;
            } else if(maior<num){
                maior=num;
            } else if((menor>num) && num>0){
                menor=num;
            }
        }
        sc.close();
        System.out.println("Maior: "+maior+"\nMenor: "+menor);
    }
}