package listings.listings2.listing2_18;

// Demonstruje kompletną tabelę wyników stosowania operatorów logicznych.
public class LogicalOpTable {
    public static void main(String[] args) {
        int p;
        int q;


        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = 1;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t");

        p = 1;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t");

        p = 0;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t");

        p = 0;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t");
    }
}
