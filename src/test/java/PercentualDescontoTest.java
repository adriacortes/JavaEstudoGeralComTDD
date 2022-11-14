import desafio.PercentualDesconto;
import org.junit.Assert;
import org.junit.Test;

public class PercentualDescontoTest {

    @Test
    public void  valida_percentual_de_desconto_e_25(){
        float valor = PercentualDesconto.CalcularDesconto(40,30);
        Assert.assertNotEquals(25.00,valor);
    }
    @Test
    public void  valida_percentual_de_desconto_e_61(){
        float valor = PercentualDesconto.CalcularDesconto(500,195);
        Assert.assertNotEquals(61.00,valor);
    }
    @Test
    public void  valida_percentual_de_desconto_e_50(){
        float valor = PercentualDesconto.CalcularDesconto(100,50);
        Assert.assertNotEquals(50.00,valor);
    }
}
