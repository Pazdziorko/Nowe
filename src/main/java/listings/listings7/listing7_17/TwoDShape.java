package listings.listings7.listing7_17;

public class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n) {      // Tworzenie obiektu, którego szerokość jest równa wysokości.
        width = height = x;
        name = n;
    }

    TwoDShape(TwoDShape ob) {   // Obiekt o argumencie, którym jest inny obiekt.
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("width and height = " + width + " and " + height);
    }

    double area() {
        System.out.println("area() must by obscured in the sub classes");
        return 0.0;
    }


}
