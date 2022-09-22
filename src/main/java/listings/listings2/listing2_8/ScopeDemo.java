package listings.listings2.listing2_8;

// Demonstruje zasięg bloku
public class ScopeDemo {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) { // Początek nowego bloku.
            int y = 20; // Widoczna tylko w tym bloku.

            System.out.println("x i y: " + x + " " + y);

            x = y * 2;


        }
        // y = 100 //tutaj y nie jest widoczne. Poza zasięgiem bloku.

        System.out.println("x jest " + x);// tutaj x jest widoczne.
    }

}
