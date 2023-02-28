import java.util.*;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numhab, consumo, somacons=0, cod, maior=0, menor=0, media, resid=0, comer=0, indus=0;

        System.out.println("Número de habitantes: ");
        numhab = sc.nextInt();
        for (int i = 1; i <= numhab; i++) {
            System.out.println("Digite seu consumo: ");
            consumo = sc.nextFloat();
            somacons += consumo;

            if (i == 1) {
                maior = consumo;
                menor = consumo;
            } else if (consumo > maior) {
                maior = consumo;
            } else if (consumo < menor) {
                menor = consumo;
            }

            System.out.println("Digite o seu código (1-Residencial, 2-Comercial, 3-Industrial): ");
            cod = sc.nextFloat();

            if (cod == 1) {
                resid += consumo;
            } else if (cod == 2) {
                comer += consumo;
            }
            else if (cod == 3) {
                indus += consumo;
            }
        }
        media = somacons/numhab;
        sc.close();
        System.out.println("\nMaior consumo: "+maior+"\nMenor consumo: "+menor+"\nMédia consumo: "+media);
        System.out.println("\nConsumo Residencial: "+resid+"\nConsumo Comercial: "+comer+"\nConsumo Insutrial: "+indus);
    }
}
