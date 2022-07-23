package exercise.listing7_6;

public class TwoDShape {
    private double width;
    private double height;

    TwoDShape(){
        width = height = 0.0;

    }

    TwoDShape(double w, double h){
        width = w;
        height = h;
    }

    TwoDShape(double x){
       width = height = x;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void showDim(){
        System.out.println("Width + height = " + width +" and " + height);
    }
}
