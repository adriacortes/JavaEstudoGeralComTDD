package JavaSintaxeBasica;

        /*O desafio consiste em um número inteiro n,
        onde será necessário calcular a diferença
        entre o produto e a soma dos seus digitos.*/

import java.util.Arrays;
import java.util.Scanner;

public class DiferancaEntreDigitos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        calcularDiferenca(numero);

    }

    public static int calcularDiferenca(int numero) {
        String numeroEmString = String.valueOf(numero);
        //String[] split = numeroEmString.split("");
        //int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();
        char separandoNumeros[] = numeroEmString.toCharArray();
        int resultado = calcularMultiplicacaoSomaDosNumeros(separandoNumeros);
        System.out.println(resultado);
        return resultado;
    }

    public  static int calcularMultiplicacaoSomaDosNumeros(char[] numeros){
        int produto=1;
        int soma=0;
        int subtracao=0;
        for (int i =0 ;i< numeros.length;i++){
            produto = produto * Integer.parseInt(String.valueOf(numeros[i]));
            soma    += Integer.parseInt(String.valueOf(numeros[i]));
          //  produto  = produto * numeros[i];
          //  soma    += numeros[i];
        }
        return subtracao=produto-soma;
    }


}
