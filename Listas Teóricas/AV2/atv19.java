import java.util.*;
public class atv19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cfab, taxa, c;

        System.out.println("Insira o custo de fábrica: ");
        cfab = sc.nextDouble();
        sc.close();

        if(cfab<=12000){
            taxa = (cfab*0.05);
            c = cfab+taxa;
            System.out.println("O custo ao consumidor é: R$ "+c);
        } else if(cfab>12000 && cfab<=25000){
            taxa = ((cfab*0.1)+(cfab*0.15));
            c = cfab+taxa;
            System.out.println("O custo ao consumidor é: R$ "+c);
        } else{
            taxa = ((cfab*0.15)+(cfab*0.2));
            c = cfab+taxa;
            System.out.println("O custo ao consumidor é: R$ "+c);
        }
    }
}