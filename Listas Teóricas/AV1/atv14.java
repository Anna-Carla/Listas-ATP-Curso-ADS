/*Leia um valor inteiro em segundos, e imprima-o em horas, minutos e segundos.*/
import java.util.*;
public class atv14 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    float seg, min, hr;

    System.out.println("Insira os segundos: ");
    seg = sc.nextFloat();
    sc.close();
    min = seg/60;
    hr = seg/3600;
    System.out.printf("Resultado: "+seg+"segundos "+min+ " minutos " + hr+" horas");
  }
}