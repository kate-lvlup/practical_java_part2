package jom.com.softserve.s2.task6;

import java.util.*;
import java.util.stream.Collectors;

public class MyUtils {
    public static List<Shape> maxAreas(List<Shape> shapes) {
        List<Shape> maxShapes = new ArrayList<>();
        double maxCircleArea = 0;
        double maxRectangleArea = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                double area = shape.getArea();
                if (area > maxCircleArea) {
                    maxCircleArea = area;
                }
            } else if (shape instanceof Rectangle) {
                double area = shape.getArea();
                if (area > maxRectangleArea) {
                    maxRectangleArea = area;
                }
            }
        }
        for (Shape shape : shapes) {
            if (shape instanceof Circle && shape.getArea() == maxCircleArea) {
                maxShapes.add(shape);
            }
        }

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle && shape.getArea() == maxRectangleArea) {
                maxShapes.add(shape);
            }
        }
        return maxShapes;
    }

}
