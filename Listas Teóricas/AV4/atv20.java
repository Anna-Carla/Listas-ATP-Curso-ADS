
public class atv20{
    public static void main(String[] args) {
    float chico=1, ze=1, anos=0;
    
    chico+= 1.50;
    ze+= 1.10;
    while(ze<chico){
        chico+=0.02;
        ze+=0.03;
        anos++;
    }
    System.out.println("Anos necessários: "+anos);
}
}    