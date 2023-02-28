import java.util.*;
public class atv2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x=0;
    float alt, maioralt=0, menoralt=0;

    while(x<5){
       System.out.println("Digite a altura:"); 
        alt = sc.nextFloat();
        if(maioralt==0 && menoralt==0){
          maioralt = alt; menoralt = alt;
        }
        if(alt>maioralt){
        maioralt = alt;
        } else if(alt<menoralt){
        menoralt = alt;
        }
        x++;
    }
    sc.close();
    System.out.println("A maior altura é: "+maioralt+"\nA menor altura é: "+menoralt);
  }  
}
