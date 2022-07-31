package listings.listing7_13;

public class TwoDShape {
    private double width;
    private double height;

    TwoDShape() {
        width = height = 0.0;
    }

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape(double x) {
        width = height = x;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }


    public void setWidth(double w) {
        this.width = w;
    }
    void showDim(){
        System.out.println("Width and height: " + width + " and " + height);
    }

}
