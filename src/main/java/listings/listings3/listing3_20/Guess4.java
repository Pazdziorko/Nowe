package listings.listings3.listing3_20;

// Zgadywanka wersja 4.
public class Guess4 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        char ignore;
        char answer = 'K';

        do {
            System.out.println("Pomyślałem literę z przedziału od A do Z.");
            System.out.print("Spróbuj ją odgadnąć: ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();

            } while (ignore != '\n');
            if (ch == answer)
                System.out.println("**Dobrze, zgadłeś!**");
            else {
                System.out.print("...Niestety, trafiłeś ");
                if (ch < answer) System.out.println("zbyt nisko!");
                else System.out.println("za wysoko! ");
                System.out.println("Spróbuj jeszcze raz!\n");
            }

        } while (answer != ch);
    }
}



