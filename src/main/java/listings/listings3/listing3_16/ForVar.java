package listings.listings3.listing3_16;
// Deklaruje zmienną sterującą wewnątrz pętli for.
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= 5; i++){
            sum += i;
            fact *= i;

        }
        System.out.println("Suma = " +sum);
        System.out.println("Silnia = " + fact);
    }
}
