import java.util.*;
public class atv14 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x;
    n = sc.nextInt();
    x=n;

    if(n%2==0){
    while(x>=0){
        System.out.print("\t"+x);
        x-=2;
    }
    }
    sc.close();
   } 
}