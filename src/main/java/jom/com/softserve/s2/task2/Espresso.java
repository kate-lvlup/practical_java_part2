package jom.com.softserve.s2.task2;

import java.util.Map;

public class Espresso extends Coffee {

    public Espresso(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        getIngredients().put("Water", 50);
        getIngredients().put("Arabica", 20);
        return getIngredients();
    }
}
