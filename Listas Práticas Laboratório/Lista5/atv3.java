import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, cont=1,  E=1, fat=1, i=2;

        System.out.println ("Digite um número para o calculo da soma fatorial: ");
            num = sc.nextDouble();
            sc.close();

            while (cont<=num) {
                while(i<=cont)  {//calc fatorial
                    fat *= i;
                    E += 1 / fat; //fórmula E= 1+ 1/fatorial
                    i++;
                }
                cont++;
        }
        System.out.print("Número fat: "+E);
    }
}