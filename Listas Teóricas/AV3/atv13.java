import java.util.*;
public class atv13 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x=0;
    n = sc.nextInt();
    
    if(n%2==0){
    while(x<=n){
        System.out.print("\t"+x);
        x+=2;
    }
    }
    sc.close();
   } 
}
