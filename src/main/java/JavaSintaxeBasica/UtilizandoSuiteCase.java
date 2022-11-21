package JavaSintaxeBasica;

public class UtilizandoSuiteCase {
    public static void main(String[] args) {
        String nome = "tiago";
        switch (nome){
            case "Tiago":
                System.out.println("Tiago");
                break;
            case "Lucas":
                System.out.println("Lucas");
                break;
            case "TIAGO":
                System.out.println("TIAGO");
            break;
            default:
                System.out.println("Invalido!");
        }
    }
}
