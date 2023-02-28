import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.println("Cateto a: ");
        a = sc.nextDouble();
        System.out.println("Cateto b: ");
        b = sc.nextDouble();
        sc.close();

        System.out.println("A hipotenusa é: " + hipotenusa(a, b));
    }

    public static double hipotenusa(double a, double b) {
        double hipo;
        hipo = Math.sqrt((a * a) + (b * b));
        return hipo;
    }
}