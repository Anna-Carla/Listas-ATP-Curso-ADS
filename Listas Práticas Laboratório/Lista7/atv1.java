public class atv1 {
    public static void main(String[] args) {
        double salario = 2000, aumento = 0.015;

        for (double ano = 1996; ano <= 2022; ano++) {
            salario += salario * aumento;
            aumento *= 2;
        }
        System.out.println("Salário atual: " + salario);
    }
}