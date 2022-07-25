package exercise.listing7_17;

public class Triangle extends TwoDShape {
    private String style;

    Triangle(){
        super();
        style = "indefinite";
    }

    Triangle( String s, double w, double h){
        super(w,h, "Triangle");
        style = s;
    }
    Triangle(double x){
        super(x, "Triangle");
        style = "full";

    }

    Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }

    double area(){
        return getWidth() * getHeight() / 2;  // Przesłania metodę area () w klasie Triangle.
    }

    void showStyle(){
        System.out.println("Tiangle is: " +style);
    }
}
