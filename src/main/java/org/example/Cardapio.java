package org.example;


package iterator;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<Pizza> pizzas = new ArrayList<>();

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public Iterator createIterator() {
        return new CardapioIterator(pizzas);
    }
}