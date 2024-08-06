package jom.com.softserve.s2.task5;

public class Square extends Rectang {
    public Square(double width) {
        super(width, width);
    }

    @Override
    public double getPerimeter() {
        return 4 * getWidth();
    }

    @Override
    public String toString() {
        return "Square [width=" + getWidth() + "]";
    }
}
