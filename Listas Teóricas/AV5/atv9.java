import java.util.*;
public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2;
        String simb;

        System.out.println("1° Número: ");
        num1 = sc.nextFloat();
        System.out.println("2° Número: ");
        num2 = sc.nextFloat();
        System.out.println("Símbolo (+) (-) (/) (*)");
        simb = sc.next();
        sc.close();

        System.out.println("Resultado: " + calculadora(num1, num2, simb));

    }

    public static float calculadora(float num1, float num2, String simb) {
        float calc1, calc2, calc3, calc4;
        if (simb.equals("+")) {
            calc1 = num1 + num2;
            return calc1;
        } else if (simb.equals("-")) {
            calc2 = num1 - num2;
            return calc2;    
        } else if (simb.equals("/")) {
            calc3 = num1 / num2;
            return calc3;
        } else if (simb.equals("*")) {
            calc4 = num1 * num2;
            return calc4;
        } else {
            return 0;
        }
    }
}