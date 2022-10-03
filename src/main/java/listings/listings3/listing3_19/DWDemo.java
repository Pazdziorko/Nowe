package listings.listings3.listing3_19;
// Demonstruje działanie pętli do-while.
public class DWDemo {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch;
        do {
            System.out.print("Naciśnij klawisz q, a po nim ENTER: ");
            ch = (char) System.in.read();
        } while (ch != 'q');


    }
}
