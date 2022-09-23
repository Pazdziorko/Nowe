package listings.listings3.listing3_3;

public class Guess2 {
    public static void main(String[] args)
        throws java.io.IOException{
        char ch;
        char answer;

        System.out.println("Pomyślałem literę z przedziału od A do Z.");
        System.out.print("Spróbuj ją odgadnąć: ");

        answer = 'K';
        ch =(char) System.in.read();

        if(ch == answer) System.out.println("**Dobrze!**");
        else System.out.println("... Niestety nie trafiłeś");


    }
}
