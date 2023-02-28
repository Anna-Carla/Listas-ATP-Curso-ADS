import java.util.*;
    public class atv7{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;
        String letra;

        System.out.println("Nota 1: ");
        n1 = sc.nextFloat();
        System.out.println("Nota 2: ");
        n2 = sc.nextFloat();
        System.out.println("Nota 3: ");
        n3 = sc.nextFloat();
        System.out.println("Insira (A) ou (P): ");
        letra = sc.nextLine();
        sc.close();

        System.out.println("Sua média: "+ media(n1, n2, n3, letra));
       } 
       public static float media(float n1, float n2, float n3, String letra){
        float arit, pond;
        if(letra.equals("A")){
            arit = (n1+n2+n3)/3;
            return arit;
        } else if(letra.equals("P")){
            pond = (n1*5)+(n2*3)+(n3*2)/10;
            return pond;
        } else{
            return 0;
        }
       }
    }
    