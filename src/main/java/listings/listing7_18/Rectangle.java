package listings.listing7_18;

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
        if (getWidth() == getHeight()) {
            return true;
        } else {
            return false;
        }
    }

    double area() {
        return getWidth() * getHeight();
    }
}
