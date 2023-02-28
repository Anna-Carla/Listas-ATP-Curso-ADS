
public class atv4 {
    public static void main(String[] args) {
        double cont=1,  S=0, fat=1, calcfat=0, i=2;

            while (cont<=5) {
                calcfat = i;
                while(calcfat>=1)  {//calc fatorial
                    fat *= calcfat;
                    calcfat--;
                }
                S += cont / fat; //fórmula E= 1+ 1/fatorial
                fat = 1;
                i+=2;
                cont++;
        }
        System.out.print("Número fat: "+S);
    }
}