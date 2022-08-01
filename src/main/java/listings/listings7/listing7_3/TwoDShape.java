package listings.listings7.listing7_3;

public class TwoDShape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    void showDim(){
        System.out.println("width + height: " + width + " and " + height);
    }
}
