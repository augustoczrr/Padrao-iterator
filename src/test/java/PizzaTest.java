package iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void devePercorrerCardapio() {

        Cardapio cardapio = new Cardapio();

        cardapio.adicionarPizza(new Pizza("Calabresa"));
        cardapio.adicionarPizza(new Pizza("Frango"));
        cardapio.adicionarPizza(new Pizza("Portuguesa"));

        Iterator iterator = cardapio.createIterator();

        int quantidade = 0;

        while (iterator.hasNext()) {
            Pizza pizza = (Pizza) iterator.next();
            quantidade++;
        }

        assertEquals(3, quantidade);
    }
}