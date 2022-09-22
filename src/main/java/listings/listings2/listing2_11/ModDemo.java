package listings.listings2.listing2_11;
// Demonstruje działanie operatora modulo %.
public class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Wynik dzielenia 10 / 3 = " + iresult + " a reszta = " + irem);
        System.out.println("Wynik dzielenia 10.0 / 3.0 = " + dresult + " a reszta = " + drem);



    }
}
