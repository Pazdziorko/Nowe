package listings.listings1.listing1_5;

public class IfDemo {
    public static void main(String[] args) {


        int a, b, c;

        a = 2;
        b = 3;

        if (a < b)
            System.out.println("a is less than b.");

        if (a == b)
            System.out.println("This is not true.");// to nie zostanie wyświetlone if = false.

        System.out.println();

        c = a - b;
        System.out.println("c = -1");

        if (c >= 0)
        System.out.println(" c is not a minus.");

        if (c < 0)
            System.out.println("c is a minus.");

        c = b - a;
        System.out.println("c = 1");
        if(c >= 0)
            System.out.println("c is a plus.");

        if (c < 0)
            System.out.println("c is a minus.");






    }
}

