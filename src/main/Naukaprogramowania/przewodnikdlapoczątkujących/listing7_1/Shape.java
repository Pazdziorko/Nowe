package przewodnikdlapoczątkujących.listing7_1;

public class Shape {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(); // definicja zmiennej t1 klasy Triangle i przypisanie jej nowego obiektu Triangle
        Triangle t2 = new Triangle();
        Rectangle r1 = new Rectangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "full";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "empty";

        System.out.println("Information about t1: ");
        t1.showDim();
        t1.ShowStyle();
        System.out.println("Area is: " + t1.area());

        System.out.println();

        System.out.println("Information about t2: ");
        t2.showDim();
        t2.ShowStyle();
        System.out.println("Area is: " +t2.area());
        System.out.println();

        r1.width = 11;
        r1.height = 10;
        System.out.println("Information about r1: ");
        System.out.println("r1 is: " + r1.isSquare());
        System.out.println("Area is: " + r1.area());


    }
}
