package listings.listings7.listing7_15;

public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);  // metoda różni się (sygnaturą - przyjmuje argument),
                                      // dlatego tylko przeciąża, a nie przesłania tą z klasy A.
    }
}
