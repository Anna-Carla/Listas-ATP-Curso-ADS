import java.util.*;
public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, l, c;

        System.out.println("Insira a distância em Km: ");
        km = sc.nextDouble();
        System.out.println("Insira a gasolina consumida: ");
        l = sc.nextDouble();
        sc.close();
        c = km/l;
        if(c==8){
            System.out.println("Venda o carro!");
        } else if(c>8 && c<14){
            System.out.println("Econômico!");
        } else if(c>14){
            System.out.println("Super econômico!");
        } else{
            System.out.println("Erro!");
        }
    }
}
