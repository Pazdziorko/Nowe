package listings.listings7.listing7_13;

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
    // Konstruktor tworzący obiekt na podstawie innego obiektu.

    Triangle(Triangle ob) {
        super(ob); // Przekazuje obiekt konstruktorowi klasy TwoDShape.
        style = ob.style;

    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is: " + style);
    }


}
