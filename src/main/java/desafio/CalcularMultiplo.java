package desafio;

import java.util.Scanner;

public class CalcularMultiplo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero=5;
        int menorMultiplo = 0;


        if (numero % 2 == 0) {
            menorMultiplo = numero;
        } else {
            menorMultiplo = numero * 2;
        }
        System.out.println("O resultado eh:"+menorMultiplo);



    }
}
