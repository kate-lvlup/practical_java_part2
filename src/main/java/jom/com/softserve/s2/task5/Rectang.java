package jom.com.softserve.s2.task5;

public class Rectang extends Shape {
    private double height;
    private double width;

    public Rectang(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return (2 * height) + (2 * width);
    }

    @Override
    public String toString() {
        return "Rectang [height=" + height + ", width=" + width + "]";
    }
}
