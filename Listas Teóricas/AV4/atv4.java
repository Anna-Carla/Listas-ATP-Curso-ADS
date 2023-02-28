
public class atv4 {
    public static void main(String[] args) {
    int num=1, num1=1, i=1, x=1;

    while(i!=0){
        if(num%1==0 && num%2==0 && num%3==0 && num%4==0 && num%5==0 && num%6==0 && num%7==0 && num%8==0 && num%9==0 &&
        num%10==0 && num%11==0 && num%12==0 && num%13==0 && num%14==0 && num%15==0 && num%16==0 && num%17==0 && num%18==0
         && num%19==0 && num%20==0){
          System.out.print("De 1 a 20: "+num);
          i=0;  
         } else{
            num++;
         }
        }
        while(x!=0){
            if(num1%1==0 && num1%2==0 && num1%3==0 && num1%4==0 && num1%5==0 && num1%6==0 && num1%7==0 && num1%8==0
             && num1%9==0 && num1%10==0){
              System.out.print("\nDe 1 a 10: "+num1);
              x=0;  
             } else{
                num1++;
             }
            }
    }
}