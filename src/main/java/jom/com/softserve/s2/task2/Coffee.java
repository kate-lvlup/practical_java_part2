package jom.com.softserve.s2.task2;

import java.util.HashMap;
import java.util.Map;

public class Coffee implements DrinkReceipt, DrinkPreparation, Rating {
    private String name;
    private int rating;
    private Map<String, Integer> ingredients;

    public Coffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.ingredients = new HashMap<>();
    }

    protected Map<String, Integer> getIngredients() {
        return ingredients;
    }

    @Override
    public Map<String, Integer> makeDrink() {
        ingredients.put("Water", 100);
        ingredients.put("Arabica", 20);
        return ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingredients.put(componentName, componentCount);
        return this;
    }

    @Override
    public int getRating() {
        return rating;
    }

}
