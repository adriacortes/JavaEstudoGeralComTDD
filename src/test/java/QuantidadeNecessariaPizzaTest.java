import desafio.QuantidadeNecessariaPizza;
import org.junit.Assert;
import org.junit.Test;

public class QuantidadeNecessariaPizzaTest {

    @Test
    public void verificar_quantidade_pizza(){
         int quantidadePizza=QuantidadeNecessariaPizza.calculaQuantidadePizza(2,5);
         Assert.assertEquals(quantidadePizza, 3);
        }

    @Test
    public void verificar_quantidade_pizza_1Pessoa_5Pedacos(){
        int quantidadePizza=QuantidadeNecessariaPizza.calculaQuantidadePizza(1,5);
        Assert.assertEquals(quantidadePizza, 2);
    }

    @Test
    public void verificar_quantidade_pizza_2Pessoa_6Pedacos(){
        int quantidadePizza=QuantidadeNecessariaPizza.calculaQuantidadePizza(2,6);
        Assert.assertEquals(quantidadePizza, 3);
    }

    @Test
    public void verificar_quantidade_pizza_3Pessoa_5Pedacos(){
        int quantidadePizza=QuantidadeNecessariaPizza.calculaQuantidadePizza(3,5);
        Assert.assertEquals(quantidadePizza, 4);
    }


    }
