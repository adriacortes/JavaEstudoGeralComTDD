package JavaSintaxeBasica;
/*
        System.out.printf - Especifica o formato da entrada do tipo de valor,
        que deve ser o mesmo tipo de dados apontado na instrução.
        Se possuir alguma dúvida verifique a tabela acima dos tipos de dados que podem ser usados.
        %d	representa números inteiros
        %f	representa números floats
        %2f	representa números doubles
        %b	representa valores booleanos
        %c	representa valores char
        \n quebra a linha
        */

public class ObjetoSaidaOut {
    public static void main(String[] args) {
        String nome = "Adria";
        String nome2= "Diogenes";
        System.out.printf("%s casada com  %s",nome,nome2);

        int num1=10;
        int num2=5;
        System.out.printf("\nA soma das variaveis "+num1+"+"+num2+"= %d",(num1+num2));

    }
}
