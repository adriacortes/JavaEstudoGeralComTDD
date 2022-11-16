package JavaSintaxeBasica;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        double valor = 1.5248;

        double valor_arred = Math.round(valor);
        double valor_arred_cima = Math.ceil(valor);
        double valor_arred_baixo = Math.floor(valor);

        System.out.println("Valor Inicial: "+valor);
        System.out.println("Valor Arredondado: "+valor_arred);
        System.out.println("Valor Arredondado p/ cima: "+valor_arred_cima);
        System.out.println("Valor Arredondado p/ baixo: "+valor_arred_baixo);
    }
}
