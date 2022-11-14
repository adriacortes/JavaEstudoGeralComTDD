package JavaSintaxeBasica;

import java.util.Scanner;

public class CalcularMenorMultiplo {
    public static void main(String[] args) {

        int numero;
        boolean encontrado=false;
        int menorMultiplo = 0;
        Scanner entrada = new Scanner(System.in);

        numero = entrada.nextInt();

        while (encontrado != true){

            if (numero % 2 == 0) {
                menorMultiplo = numero;
                encontrado = true;
                System.out.println("O resultado eh:"+menorMultiplo);
            }
            else
                numero += numero;
        }



    }
}
