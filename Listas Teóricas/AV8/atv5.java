
public class atv5 {
    public static void main(String[] args) {
    float [] vet = new float[5];
    float formula, teste;

    for (int i = 0; i < vet.length; i++) {
        teste = (i+(5*i))/(i+1);
        formula = (i+(5*i))%(i+1);
        System.out.println(i);
        System.out.println("Inteiro: "+teste);
        System.out.println("Resultado: "+formula+"\n");
    }
    }
}