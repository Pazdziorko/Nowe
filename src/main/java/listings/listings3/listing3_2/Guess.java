package listings.listings3.listing3_2;
// Zgadywanka-instrukcja warunkowa if.
public class Guess {
    public static void main(String[] args)
        throws java.io.IOException{
        char ch;
        char answer;

        answer = 'K';

        System.out.println("Pomyślałem literę z przedziału od A do Z.");
        System.out.print("Spróbuj ją odgadnąć: ");

        ch = (char) System.in.read();
        if(ch == answer) System.out.println("**Dobrze!**");
    }

}
