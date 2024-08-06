package jom.com.softserve.s2.task2;

import java.util.Map;

public class Cappuccino extends Coffee {
    public Cappuccino(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        getIngredients().put("Water", 100);
        getIngredients().put("Arabica", 20);
        getIngredients().put("Milk", 50);
        return getIngredients();
    }
}
