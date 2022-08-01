package listings.listings7.listing7_13;

public class Shape {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("empty", 8.0, 12.0);
        Triangle t2 = new Triangle(t1); // Tworzenie kopii obiektu t1.

        System.out.println("Information about t1:");
        t1.showDim();
        t1.showStyle();
        System.out.println("Area for t1 = " + t1.area());

        System.out.println();

        System.out.println("Information about t2:");
        t2.showDim();
        t2.showStyle();
        System.out.println("Area for t1 = " + t2.area());
    }
}
