
public class atv8 {
  public static void main (String[] args) {
    
    double p, g1, g2, g3;

    p = 780000;
    g1 = (p*0.46);
    g2 = (p*0.32);
    g3 = (p-(g1+g2));
    System.out.printf("Resultado"+"\nGanhador 1: "+g1+"\nGanhador 2: "+g2+"\nGanhador 3: "+g3);
  }
}
