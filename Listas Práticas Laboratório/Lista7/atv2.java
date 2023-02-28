import java.util.Scanner;

public class atv2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saque, calc;

        System.out.println("Digite o saque:");
        saque = sc.nextInt();
        sc.close();

        calc = saque/100;
        System.out.println("Notas de R$ 100: "+calc);
        saque = saque - (calc*100);
        calc = saque/50;
        System.out.println("Notas de R$ 50: "+calc);
        saque = saque - (calc*50);
        calc = saque/20;
        System.out.println("Notas de R$ 20: "+calc);
        saque = saque - (calc*20);
        calc = saque/10;
        System.out.println("Notas de R$ 10: "+calc);
        saque = saque - (calc*10);
        calc = saque/5;
        System.out.println("Notas de R$ 5: "+calc);
        saque = saque - (calc*5);
        calc = saque/2;
        System.out.println("Notas de R$ 2: "+calc);
        saque = saque - (calc*2);
        calc = saque/1;
        System.out.println("Moedas de R$ 1: "+calc);

}
}