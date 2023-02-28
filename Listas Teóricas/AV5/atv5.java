import java.util.*;
    public class atv5{
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alt, r;

        System.out.println("Altura: ");
        alt = sc.nextDouble();
        System.out.println("Raio: ");
        r = sc.nextDouble();
        sc.close();

        System.out.println("Volume do cilíndro: "+ volume(alt, r));
       }
       public static double volume(double alt, double r){
        double vol;
        vol = 3.14*(r*r)*alt;
        return vol;
       }
    }