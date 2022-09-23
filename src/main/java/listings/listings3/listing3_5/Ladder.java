package listings.listings3.listing3_5;

// Demonstruje drabinkę if-else-if.
public class Ladder {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 6; i++) {
            if (i == 1)
                System.out.println("i = 1");
            else if (i == 2)
                System.out.println("i = 2");
            else if (i == 3)
                System.out.println("i = 3");
            else if (i == 4)
                System.out.println("i = 4");
            else System.out.println("i nie należy do przedziału od 1 do 4");

        }
    }
}

