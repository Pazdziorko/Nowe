package listings.listings7.listing7_9;

public class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "indefinite";
    }

    Triangle(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle(double x) {
        super(x);
        style = "full";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
