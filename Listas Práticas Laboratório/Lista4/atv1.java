public class atv1{
    public static void main(String[] args) {
    int num=1, soma=0;
    
    while(num<=15){
        if(num%3==0 && num%2!=0){
            soma= soma+num;
        }
        num++;
    }
    System.out.println("A soma dos ímpares é: "+soma);
    }
}