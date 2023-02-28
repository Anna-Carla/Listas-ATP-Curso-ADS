
public class atv5 {
    public static void main(String[] args) {
        int inicio = 100, fim = 999, maior = 0, prod, a, b, c, d, e, f;

        for (int posicao = inicio; posicao <= fim; posicao++) { //delimita um intervalo
            for (int i = inicio; i <= fim; i++) {
                prod = posicao * i;

                a = prod / 100000; //inverte os números para comparação
                b = prod / 10000 % 10;
                c = prod / 1000 % 10;
                d = prod / 100 % 10;
                e = prod % 100 / 10;
                f = prod % 10;
                if (a == f && b == e && c == d) { //compara posição para ver se é palíndromo
                    if(prod>maior){
                    maior = prod;
                    }
                }
            }
        }
        System.out.println("O maior palíndromo: "+maior);
    }
}