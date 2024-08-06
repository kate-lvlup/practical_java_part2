package jom.com.softserve.s2.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyUtils {
    public static Map<String, Double> averageRating(List<Coffee> coffeeList) {
            Map<String, Double> averageRatings = new HashMap<>();
            Map<String, Integer> ratingCount = new HashMap<>();

            for (Coffee coffee : coffeeList) {
                String coffeeName = coffee.getName();
                int coffeeRating = coffee.getRating();

                if (averageRatings.containsKey(coffeeName)) {
                    double currentTotalRating = averageRatings.get(coffeeName);
                    averageRatings.put(coffeeName, currentTotalRating + coffeeRating);
                } else {
                    averageRatings.put(coffeeName, (double) coffeeRating);
                }

                if (ratingCount.containsKey(coffeeName)) {
                    int ratingTotalCount = ratingCount.get(coffeeName);
                    ratingCount.put(coffeeName, ratingTotalCount + 1);
                } else {
                    ratingCount.put(coffeeName, 1);
                }
            }

            for (Map.Entry<String, Double> entry : averageRatings.entrySet()) {
                String coffeeName = entry.getKey();
                double totalRating = entry.getValue();
                int count = ratingCount.get(coffeeName);
                averageRatings.put(coffeeName, totalRating / count);
            }

            return averageRatings;
        }
}
