import java.util.*;
public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float b, alt, area;

        System.out.println("Valor base: ");
        b = sc.nextFloat();
        System.out.println("Valor altura:" );
        alt = sc.nextFloat();
        sc.close();

        if(b>0 && alt>0){
            area = (b*alt)/2;
            System.out.println("A área do triagulo é: "+area);
        } else{
            System.out.println("Dados inválidos");
        }
    }
}