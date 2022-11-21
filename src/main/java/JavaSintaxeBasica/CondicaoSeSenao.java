package JavaSintaxeBasica;

import java.util.Scanner;

public class CondicaoSeSenao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if(numero > 100 && numero<=200){
            System.out.println("Numero OK");
        }else {
            if (numero == 0){
                System.out.println("Numero Invalido");
            }
            if (numero < 0){
                System.out.println("Numero menor que 0!");
            }
            else if (numero>0 && numero<100){
                System.out.println("Numero OK");
            }
        }
    }
}
