import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculaNumeroFeliz {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        executa(n);
    }


    public static boolean executa(int numero) {
        int resultado = numero;
        int contador = 0;
        while (resultado != 1 && contador < 50) {
            int[] numerosDecompostos = decomporNumero(resultado);
            int[] numerosDecompostosElevados = elevarA2PotenciaOsNumerosDecompostos(numerosDecompostos);
            resultado = totalizaNumerosElevados(numerosDecompostosElevados);
            if (resultado == 1) {
                System.out.println("true");
                return true;
            }
            contador++;
        }
        System.out.println("false");
        return false;
    }

    private static int totalizaNumerosElevados(int[] numerosDecompostosElevados) {
        var totalizador = 0;
        for (int i = 0; i < numerosDecompostosElevados.length; i++) {
            totalizador += numerosDecompostosElevados[i];
        }
        return totalizador;
    }

    private static int[] elevarA2PotenciaOsNumerosDecompostos(int[] numerosDecompostos) {
        var retorno = new int[numerosDecompostos.length];
        for (int i = 0; i < numerosDecompostos.length; i++) {
            retorno[i] = (int) Math.pow(numerosDecompostos[i],2);
        }
        return retorno;
    }

    private static int[] decomporNumero(int numero) {
        char[] chars = Integer.toString(numero).toCharArray();
        var numeros = new int[chars.length];
        for (int index = 0; index < chars.length; index++) {
            numeros[index] = Integer.parseInt(String.valueOf(chars[index]));
        }
        return  numeros;
    }
}
