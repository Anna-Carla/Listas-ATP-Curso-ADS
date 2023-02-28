public class atv6 {
    public static void main(String[] args) {
    double somaq=0, soma=0, qsoma=0, num=1;

    while(num<=100){
        soma+= num;
        somaq+= num*num;
        qsoma= Math.pow(soma, 2);
        num++;
    }
    System.out.println(qsoma-somaq);
}
}