package jom.com.softserve.s2.task5;

import java.util.List;
import java.util.stream.Collectors;

public class MyUtils {

    public <T extends Shape> double sumPerimeter(List<T> figures) {
        double sum = 0.0;
        for (T figure : figures) {
            if (figure != null) {
                sum += figure.getPerimeter();
            }
        }
        return sum;
    }
}
