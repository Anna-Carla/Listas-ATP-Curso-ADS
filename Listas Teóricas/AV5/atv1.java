import java.util.*;
public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr, min, seg;

        System.out.println("Insira horas: ");
        hr = sc.nextInt();
        System.out.println("Insira minutos: ");
        min = sc.nextInt();
        System.out.println("Insira segundos: ");
        seg = sc.nextInt();
        sc.close();

        System.out.println("Resultado: " + conversor(hr, min, seg) + " seg");
    }

    public static int conversor(int hr, int min, int seg) {
        int conv;
        conv = (hr * 3600) + (min * 60) + seg;
        return conv;
    }
}