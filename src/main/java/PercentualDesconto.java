import java.util.Scanner;

public class PercentualDesconto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float valorProdutoSemDesconto = input.nextInt();
        float valorProdutoComDesconto = input.nextInt();

        float percentual = CalcularDesconto(valorProdutoSemDesconto,valorProdutoComDesconto);
        System.out.format("O desconto foi de %.0f%%%n" ,percentual);
    }

    public static float CalcularDesconto(float valorSemDesconto, float valorComDescont){
        float percentualDesconto = (100- (valorComDescont / valorSemDesconto)* 100);
        return percentualDesconto;
    }

}
