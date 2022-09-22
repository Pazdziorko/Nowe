package listings.listings2.listing2_13;
// Demonstruje stosowanie operatorów warunkowych.
public class SCops {
    public static void main(String[] args) {
        int n, d, q;
        n =10;
        d = 2;
        if(d != 0 && (n % d) ==0) System.out.println(d + " jest dzielnikiem " + n); // tutaj && zapobiega dzieleniu przez 0.

        d = 0;
        if(d != 0 && (n % d) ==0) System.out.println(d + " jest dzielnikiem " + n);
        //if(d != 0 & (n % d) ==0) System.out.println(d + " jest dzielnikiem " +n); Operacja z operatorem & będzie błędna.
    }
}
