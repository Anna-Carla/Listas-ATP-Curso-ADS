public class atv7 {
    public static void main(String[] args) {
        int parte1, parte2, soma, mult;

        for(int i=1000; i<9999; i++){
            parte1 = i/100;
            parte2 = i%100;
            soma = parte1+parte2;
            mult = soma*soma;

            if(mult==i){
                System.out.println("\n"+i);
                System.out.println(parte1+"+"+parte2+" = "+soma);
                System.out.println(mult);
            }
        }
    }
}