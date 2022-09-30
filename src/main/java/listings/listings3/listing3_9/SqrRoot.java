package listings.listings3.listing3_9;
// Wyliczenie pierwiastka wartości od 1 do 99 i błąd zaokrąglenia.
public class SqrRoot {
    public static void main(String[] args) {
        double num;
        double sroot;
        double rerr;

        for (num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Pierwiastek kwadratowy z " +num + " = " +sroot);

            rerr = num - (sroot * sroot);
            System.out.println("Błąd zaokrąglenia =" + rerr);
            System.out.println();




        }
    }
}
