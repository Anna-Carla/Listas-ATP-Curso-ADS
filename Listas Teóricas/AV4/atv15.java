import java.util.*;
public class atv15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opção=1;
        float km, ms;
        
        while(opção!=3){
        System.out.println("Opção 1: Converter km/h para m/s: ");
        System.out.println("Opção 2: Converter m/s para km/h: ");
        System.out.println("Opção 3: Sair");
        opção = sc.nextInt();

        switch(opção){
            case 1:
            System.out.println("Digite os km/h: ");
            km = sc.nextFloat();
            System.out.println("Igual a: "+(km/3.6)+" ms");
            break;
            case 2:
            System.out.println("Digite os m/s: ");
            ms = sc.nextFloat();
            System.out.println("Igual a: "+(ms*3.6)+" km/h");
            break;
            case 3:
            System.out.println("Você saiu!");
            break;
            default:
            System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}
