package przewodnikdlapoczątkujących.listing7_5;

public class TwoDShape {
    private double width;
    private double height;

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void showDim() {
        System.out.println("width + height = " + width + " and " + height);
    }


}

