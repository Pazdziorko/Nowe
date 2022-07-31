package listings.listing7_18;

abstract class TwoDShape {
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

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape(TwoDShape ob) {
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
        System.out.println("width + height: " + width + " and " + height);
    }

    abstract double area();
}
