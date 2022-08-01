package listings.listings7.listing7_12;

public class SubSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);

        x2 = x;
        System.out.println("x2.a: " + x2.a);

        x2 = y;
        System.out.println("x2.a: " + x2.a);

        x2.a = 19;
       // x2.b = 27; Niepoprawne użycie. Referencje typu X mogą odwoływać się tylko do składowych klasy X.
        // X (klasa) nie ma składowej b
    }
}
