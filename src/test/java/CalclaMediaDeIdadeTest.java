import desafiosGFT.CalculaMediaDeIdade;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalclaMediaDeIdadeTest {

    @Test
    public void verifica_se_a_turma_e_jovem()
    {
        String resposta = new CalculaMediaDeIdade().executa(0,14,22);
        Assert.assertEquals("Jovem!",resposta);
    }

    @Test
    public void verifica_se_a_turma_e_idosa()
    {
        String resposta = new CalculaMediaDeIdade().executa(60,60,61);
        Assert.assertEquals("Idosa!",resposta);
    }

    @Test
    public void verifica_se_a_turma_e_adulta()
    {
        String resposta = new CalculaMediaDeIdade().executa(27,50,60);
        Assert.assertEquals("Adulta!",resposta);
    }

    @Test
    public void verifica_se_a_entrada_e_valida()
    {
        String resposta = new CalculaMediaDeIdade().validarEntrada(2,-5,3);
        Assert.assertEquals("",resposta);
    }
}

