package desafio;

import java.util.Scanner;


public class CalculaMediaDeIdade {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

        validarEntrada(idade1,idade2,idade3);

    }
    public static String validarEntrada(int idade1,int idade2,int idade3){
        String valida;
        if (idade1 < 0 || idade2 < 0 || idade3 < 0){
            return "";
        }
        executa(idade1,idade2,idade3);
        valida="ok";
        return valida;
    }
    public static String executa(int idade1,int idade2,int idade3){
        int media = ( (idade1+idade2+idade3)/3);
        String resultado = classificaMediaIdades(media);
        System.out.println(resultado);
        return resultado;
    }


    private static String classificaMediaIdades(int media) {
        String resultado;
        if (media <= 25){
            resultado = "Jovem!";
        }
        else if (media > 25 && media < 60){
             resultado = "Adulta!";
        }
        else {
            resultado = "Idosa!";
        }
        return resultado;
    }

}








