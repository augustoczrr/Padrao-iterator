package iterator;

import java.util.List;

public class CardapioIterator implements Iterator {

    private List<Pizza> pizzas;
    private int posicao = 0;

    public CardapioIterator(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public boolean hasNext() {
        return posicao < pizzas.size();
    }

    @Override
    public Object next() {
        Pizza pizza = pizzas.get(posicao);
        posicao++;
        return pizza;
    }
}