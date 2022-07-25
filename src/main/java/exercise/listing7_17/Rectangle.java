package exercise.listing7_17;

public class Rectangle extends TwoDShape {

    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "Rectangle");

    }

    Rectangle(double x) {
        super(x, "Rectangle");
    }

    Rectangle(Rectangle ob) {
        super(ob);

    }

    boolean isSquare() {
        return getWidth() == getHeight();

    }

    double area() {
        return getWidth() * getHeight();

    }


}
