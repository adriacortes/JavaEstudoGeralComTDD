package desafiosGFT;

import java.util.Scanner;

public class FilaAtendimentoBancario {
    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner entrada = new Scanner(System.in);

        for (int index = 0; index < nomesFila.length; index++) {
            nomesFila[index] = entrada.next();
            System.out.format("%s - esta na posicao: %d%n", nomesFila[index], (index + 1));
        }
    }
}
