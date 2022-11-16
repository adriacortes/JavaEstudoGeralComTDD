package desafio;

import java.util.Scanner;

public class QuantidadeNecessariaPizza {

    public static void main(String[] args) {
        final int PIZZAINTEIRA = 4;
        Scanner scanner = new Scanner(System.in);


         int teste = scanner.nextInt();

         for(int i = 0;i<teste;i++)
         {
            int quantidadeDePessoa = scanner.nextInt();
            int quantidadeDePizzaPorPessoa = scanner.nextInt();
            calculaQuantidadePizza(quantidadeDePessoa,quantidadeDePizzaPorPessoa);
         }

    }

    public static int calculaQuantidadePizza(int quantidadePessoa,int pedacoPizzaPorPessoa){
        double totalFatias = quantidadePessoa*pedacoPizzaPorPessoa;
        Double quantidadePizza = Double.valueOf(totalFatias/4.0);
        int quantidadeTotalDePizza = (int)Math.ceil(quantidadePizza);
        System.out.println(quantidadeTotalDePizza);
        return quantidadeTotalDePizza;
    }

}

