package listings.listings3.listing3_4;

public class Guess3 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        char answer;

        answer = 'K';

        System.out.println("Pomyślałem literę z przedziału od A do Z.");
        System.out.print("Spróbuj ją odgadnąć: ");

        ch = (char) System.in.read();

        if (ch == answer)
            System.out.println("Gratuluję odgadłeś!");
        else {
            System.out.print("Niestety błędna odpowiedź, trafiłeś ");
            if (ch < answer)
                System.out.println("zbyt nisko");
            else System.out.print("zbyt wysoko");
        }

    }
}
