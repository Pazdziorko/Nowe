package listings.listing7_4;

public class Shape {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("full",8.2, 8.2);
        Triangle t2 = new Triangle("empty", 12.8, 7.6);

        System.out.println("Information about t1: ");
        t1.showDim();
        t1.showStyle();
        System.out.println("Area for t1 = " + t1.area());
        System.out.println();

        System.out.println("Information about t2: ");
        t2.showDim();
        t2.showStyle();
        System.out.println("Area for t2 = " + t2.area());

    }
}
