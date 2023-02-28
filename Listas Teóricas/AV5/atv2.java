import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;

        System.out.println("Temperatura em °C: ");
        c = sc.nextDouble();
        sc.close();

        System.out.println("Temperatura em °F: " + conversor(c));
    }

    public static double conversor(double c) {
        double conv;
        conv = (c * 1.8) + 32;
        return conv;
    }
}