import desafiosGFT.VerificarTurno;
import org.junit.Assert;
import org.junit.Test;

public class VerificarTurnoTeste {

    @Test
    public void verifica_se_e_dia(){
        String resposta = VerificarTurno.executar("M");
        Assert.assertEquals("Bom dia!",resposta);
    }

    @Test
    public void verifica_se_e_tarde(){
        String resposta = VerificarTurno.executar("V");
        Assert.assertEquals("Boa Tarde!",resposta);
    }

    @Test
    public void verifica_se_e_noite(){
        String resposta = VerificarTurno.executar("N");
        Assert.assertEquals("Boa Noite!",resposta);
    }

    @Test
    public void verifica_se_a_entrada_e_valida(){
        String resposta = VerificarTurno.executar("T");
        Assert.assertEquals("Valor Inválido!",resposta);
    }


}
