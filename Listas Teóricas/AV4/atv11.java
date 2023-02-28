import java.util.*;
public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       float r1=1, r2=1, R=0;

        while(r1!=0 && r2!=0){
            System.out.println("\nResistência 1: ");
            r1 = sc.nextFloat();
            System.out.println("Resistência 2: ");
            r2 = sc.nextFloat();
            R = (r1*r2)/(r1+r2);
            System.out.println("Resultado: "+R);
        }
        sc.close();
    }
}
