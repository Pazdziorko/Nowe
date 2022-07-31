package listings.listing7_3;

public class Shape {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "isosceles";


        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "rectangular";

        System.out.println("Information about t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area for t1 = " + t1.area());
        System.out.println();

        System.out.println("Information about t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area for t2 = " + t2.area());

    }
}
