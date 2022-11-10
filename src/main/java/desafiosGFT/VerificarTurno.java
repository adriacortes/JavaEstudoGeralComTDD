package desafiosGFT;

import java.util.Scanner;

public class VerificarTurno {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        char turno = leitor.next().toUpperCase().charAt(0);
        String turnoInformado = String.valueOf(turno);
        executar(turnoInformado);
    }

    public static String executar(String entrada){
        String turno = verificandoTurnoInformado(entrada);
        System.out.println(turno);
        return turno;
    }

    private static String verificandoTurnoInformado(String entrada) {
        String turno="";

        switch (entrada)
        {
            case "M":
                turno="Bom Dia!";
            break;

            case "V":
                turno="Boa Tarde!";
            break;

            case "N":
                turno="Boa Noite!";
            break;
            default:
                turno="Valor Inválido!";

        }
        return turno;
    }

}

