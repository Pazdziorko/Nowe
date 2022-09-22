package listings.listings2.listing2_9;
// Demonstruje czas istnienia zmiennej.
public class VarInitDemo {
    public static void main(String[] args) {
        int x;
        for(x = 0; x<10; x++){
            int y = -1; // zostaje zapoczątkowana z każdym rozpoczęciem bloku.
            System.out.println("y wynosi: " + y);

            y = 100; // nastąpiła nowa inicjacja. Przypisano nową wartość dla zmiennej y.
            System.out.println("a teraz y wynosi: " +y);

        }
    }
}
