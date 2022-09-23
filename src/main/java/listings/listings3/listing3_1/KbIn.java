package listings.listings3.listing3_1;
// Wczytuje znak z klawiatury.
public class KbIn {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch;
        System.out.print("Wprowadź znak, a następnie naciśnij ENTER: ");

        ch = (char) System.in.read();

        System.out.println("Wprowadziłeś: " +ch);

        }
    }

