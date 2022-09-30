package listings.listings3.listing3_12;
// Wykonuje pętle for do momentu naciśnięcia S.
public class ForTest {
    public static void main(String[] args)
        throws java.io.IOException{
        int i;
        System.out.println("Wprowadź S, aby zakończyć działanie pętli.");

        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Przebieg " +i);

    }
}
