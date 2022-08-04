package listings.listings2.listing2_1;

public class Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("Cubic mile have " + ci + " cubic inches.");
    }
}
