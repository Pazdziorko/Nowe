package listings.listings7.listing7_15;

public class Overload {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("Element k = "); // metoda z klasy B.
        subOb.show();                    // metoda z klasy A.
    }
}
