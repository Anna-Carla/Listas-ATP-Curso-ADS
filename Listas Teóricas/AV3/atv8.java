import java.util.*;
public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, menor=0, maior=0;

        for(int i=0; i<10; i++){
            n = sc.nextInt();
            if(i==0){
                maior=n; menor=n;               
            } if(n<menor){
                menor=n;
            } if(n>maior){
                maior=n;
            }
        }
        sc.close();
        System.out.println("Maior: "+maior+"\nMenor: "+menor);
    }
}
