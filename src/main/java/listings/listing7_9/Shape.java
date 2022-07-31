package listings.listing7_9;

public class Shape {
    public static void main(String[] args) {

        ColorTriangle t1 = new ColorTriangle("blue", "empty", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("red", "full", 4.0, 2.0);

        System.out.println("Information about t1:");
        t1.showDim();
        t1.showStyle();
        t1.showColor();
        System.out.println("Area for t1 = " + t1.area());

        System.out.println();

        System.out.println("Information about t2:");
        t2.showDim();
        t2.showStyle();
        t2.showColor();
        System.out.println("Area for t2 = " + t2.area());


    }
}
