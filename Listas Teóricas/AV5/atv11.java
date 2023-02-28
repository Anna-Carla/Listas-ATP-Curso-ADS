import java.util.*;

public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.println("1º Lado: ");
        lado1 = sc.nextInt();
        System.out.println("2º Lado: ");
        lado2 = sc.nextInt();
        System.out.println("3º Lado: ");
        lado3 = sc.nextInt();
        sc.close();

        if (lado1 > 0 && lado2 > 0 && lado3 > 0) {

            if (teste(lado1, lado2, lado3) == true) {
                if (tipo(lado1, lado2, lado3) == 1) {
                    System.out.println("Equilatéro");
                } else if (tipo(lado1, lado2, lado3) == 2) {
                    System.out.println("Escaleno");
                } else {
                    System.out.println("Isóceles");
                }
            } else {
                System.out.println("Não é um triangulo");
            }
        }
    }

    public static boolean teste(int lado1, int lado2, int lado3) { // Ver se forma um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            return true;
        } else {
            return false;
        }
    }

    public static int tipo(int lado1, int lado2, int lado3) { //tipo de triangulo
        if (lado1 == lado2 && lado1 == lado3) { //equilatero
            return 1;
        } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) { //escaleno
            return 2;
        } else { 
            return 3;
        }
    }
}