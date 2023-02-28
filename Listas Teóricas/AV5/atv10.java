import java.util.*;
public class atv10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float km, l;

        System.out.println("Insira os km: ");
        km = sc.nextFloat();
        System.out.println("Insira os litros: ");
        l = sc.nextFloat();
        sc.close();

        if(consumo(km, l)<8){
            System.out.println("Venda o carro!");
        } else if(consumo(km, l)>=8 && consumo(km, l)<=14){
            System.out.println("Econômico!");
        } else{
            System.out.println("Super econômico");
        }
    }
    public static float consumo(float km, float l){
        float cons;
        cons = km/l;
        return cons;
    }
}