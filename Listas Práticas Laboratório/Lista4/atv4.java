import java.util.*;
public class atv4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=0, cont1=0, cont2=0, cont3=0, cont4=0;

    while(num>=0){
    System.out.println("Insira um número: ");
    num = sc.nextInt();
    if(num>=0 && num<=25){
        cont1++;
    } else if(num>=26 && num<=50){
        cont2++;
    } else if(num>=51 && num<=75){
        cont3++;
    } else if(num>=76 && num<=100){
        cont4++;
    }
}
    sc.close();
    System.out.println("Números de 0-25: "+cont1+
    "\nNúmeros de 26-50: "+cont2+"\nNúmeros de 51-75: "+cont3+"\nNúmeros de 76-100: "+cont4);
}
}