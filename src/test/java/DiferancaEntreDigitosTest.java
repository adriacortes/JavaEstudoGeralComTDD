import JavaSintaxeBasica.DiferancaEntreDigitos;
import org.junit.Assert;
import org.junit.Test;

public class DiferancaEntreDigitosTest {

    @Test
    public void verificar_subtracao_diferenca_entre_digitos243(){
        int resultado = new DiferancaEntreDigitos().calcularDiferenca(243);
        Assert.assertEquals(15,resultado);
    }

    @Test
    public void verificar_subtracao_diferenca_entre_digitosOutro621(){
        int resultado = new DiferancaEntreDigitos().calcularDiferenca(621);
        Assert.assertEquals(3,resultado);
    }

    @Test
    public void verificar_subtracao_diferenca_entre_digitosOutro46(){
        int resultado = new DiferancaEntreDigitos().calcularDiferenca(46);;
        Assert.assertEquals(14,resultado);
    }
}
