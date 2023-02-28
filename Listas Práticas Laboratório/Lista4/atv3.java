import java.util.*;
public class atv3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float num=1, m=0, vp=0, vn=0, pn=0, pp=0, soma=0;

    while(num!=0){
    System.out.println("Digite um número (Para receber os resultados digite 0): ");
    num = sc.nextFloat();
    soma += num;
    if(num>0){
        vp++;
    } else if(num<0){
        vn++;
    }
}
    pp = (vp/(vp+vn))*100;
    pn = (vn/(vp+vn))*100;
    m = soma/(vp+vn);
    sc.close();
    System.out.println("Média Aritmética: "+m);
    System.out.println("\nQuantidade positivos: "+vp+"\nQuantidade negativos: "+vn);
    System.out.println("\nPercentual de positivos: "+pp+"\nPercentual de negativos: "+pn);
}
}

    
