import desafio.CalculaNumeroFeliz;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4ClassRunner.class)
public class CalculaNumeroFelizTest {

    @Test
    public void deve_calcular_um_numero_feliz_e_retornar_TRUE_quando_encontrar(){
        boolean resultado = new CalculaNumeroFeliz().executa(19);

        assertTrue(resultado);
    }

    @Test
    public void deve_calcular_um_numero_feliz_e_retornar_FALSE_quando_encontrar(){
        boolean resultado = new CalculaNumeroFeliz().executa(2);

        assertFalse(resultado);
    }

}