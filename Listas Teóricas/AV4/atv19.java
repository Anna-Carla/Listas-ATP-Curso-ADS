
public class atv19{
    public static void main(String[] args) {
    float joao=1000, carlos=4000, meses=0;
    

    while(joao<=carlos){
        carlos+= carlos*0.02;
        joao+= joao*0.05;

        meses++;
    }
    System.out.println("Meses necessários: "+meses);
}
}    