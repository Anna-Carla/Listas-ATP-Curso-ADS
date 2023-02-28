import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        double precoProduto,juros, parcelaMensal,precoJuros,comissao;
        int formaPgto, parcelas;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto");
        precoProduto = sc.nextDouble();
        
        System.out.println("Escolha a forma de pagamento");
        System.out.println("1 - À vista");
        System.out.println("2 - Parcelado");
        formaPgto = sc.nextInt();
        
        switch(formaPgto){
            case 1:
                precoProduto = precoProduto - (precoProduto*0.1);
                System.out.println("Total com desconto: "+ precoProduto);
                break;
            case 2:
                System.out.println("Infore a quantidade de parcelas");
                parcelas = sc.nextInt();
                if(parcelas <= 3){
                    parcelaMensal = precoProduto/parcelas;
                    System.out.println("Total de valor dividido de "+ parcelas 
                    + " x: R$ " + parcelaMensal);
                }else{
                    System.out.println("Informa a taxa de juros");
                    juros = sc.nextDouble();
                    //a taxa de juros medida em porcentagem
                    juros = juros/100;
                    parcelaMensal = precoProduto/parcelas + (precoProduto*juros)/parcelas;
                    System.out.println("Total de valor dividido de "+ parcelas 
                    + " x: R$ " + parcelaMensal);
                    precoJuros = parcelaMensal * parcelas;
                    System.out.println("Valor total com juros " + precoJuros);
                    //comissao do vendedor
                    comissao = precoJuros*0.05;
                    System.out.println("Comissão do vendedor "+ comissao);
                }
                break;
            default:
                System.out.println("Forma de pagamento inválida!");
                sc.close();
        }
    }
}
