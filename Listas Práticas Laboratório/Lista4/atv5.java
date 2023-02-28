import java.util.*;
public class atv5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=0, qtpositivo=0;

    while(num>=0){
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        if(num>=0){
            qtpositivo++;
        }
    }
    sc.close();
    System.out.println("Quantidade de positivos: "+qtpositivo);
}
}


