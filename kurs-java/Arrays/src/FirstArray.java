import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {

        // Tablice jednowymiarowe

        int array[] = new int[10]; // deklaracja tablicy array typu int o 10 elementach. Indeksy od 0 do 10.
        array[0] = 0; // przypisanie do indeksu 0 w tablicy wartości 0.
        array[1] = 1; // przypisanie do indeksu 1 w tablicy wartości 1.
        array[2] = 2; // przypisanie do indeksu 2 w tablicy wartości 2.
        array[3] = 3; // przypisanie do indeksu 3 w tablicy wartości 3.
        array[4] = 4; // przypisanie do indeksu 4 w tablicy wartości 4.
        array[5] = 5; // przypisanie do indeksu 5 w tablicy wartości 5.
        array[6] = 6; // przypisanie do indeksu 6 w tablicy wartości 6.
        array[7] = 7; // przypisanie do indeksu 7 w tablicy wartości 7.
        array[8] = 8; // przypisanie do indeksu 8 w tablicy wartości 8.
        array[9] = 9; // przypisanie do indeksu 9 w tablicy wartości 9.
        for (int i = 0; i < 10; i++) {
            // Pętla for ze zmienną iterującą i o liczniku iteracji 0.
            // Następnie warunek zakończenia pętli i zwiększenie licznika o 1.
            // array.length spowoduje iterowanie po długości tablicy
            // zależnie od tego jaką długość zainicjowaliśmy na początku. Była wartość 10 i możemy ją zmienić na inną.
            // co jest pomocne jeżeli operujemy w wielu klasach.

            System.out.println("Indeks tablicy = " + array[i]);

        }
        for (int b : array) {
            // Iterowaniee po tablicy.
            // Pętla foreach, powtarzająca zmienną iteracyjną "i" dla wszystkich elementów tabeli.
            // Skracająca kod i łatwiejsza w użyciu.

            System.out.println("Element tablicy = " + b);
        }

        int c = 10;   // inicjacja zmiennej c typu int, użytej w pętli while
        while (c > 0) // warunek zakończenia pętli


        {
            System.out.println("Wartość = " + c);
            c--; // dekrementacja zmiennej c o 1
        }
        do { // pętla do while, różni się od pętli while tym, że wykona się przynajmniej raz
            // nawet jeżeli warunek jest błędny.
            c++;
            System.out.println("Witam");

        } while (c < 5);

        System.out.println("Żegnam");


        // Tablice wielowymiarowe(tablice tablic)

        // int newarray[][] = new int[5][10]; // Deklaracja tablicy newarray pierwsza o 5 elementach, druga o 10.
        int newarray[][] =
                {{1, 2, 3, 4, 5},
                        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                }; // Deklaracja gdy znamy wartości elementów.

        // Deklaracja i inicjacja petli złożonej (pętli w pętli)
        //  Tutaj, aby wywołać wartości z jednej i drugiej tablicy.

        for (int i = 0; i < newarray.length; i++) {
            for (int j = 0; j < newarray[i].length; j++)
                System.out.println(newarray[i][j]);
        }
        // Jeszcze jeden przykład pętli złożonej
        for (int e = 10; e > 0; e--) {
            for (int f = 5; f < 10; f++)
                System.out.println("Zmienna e = " + e + " Zmienna f = " + f);
            /*Najpierw sprawdzany jest warunek z pętli zagnieżdżonej- tej drugiej
             i jest wykonywany dopóki jest prawdziwy.
             Czyli tutaj druga pętla sprawdza czy wartość zmiennej f spełnia warunek
              a dopiero potem gdy już nie spełnia sprawdza warunek z pętli pierwszej.
               Czyli zaczyna od f=5, bo jest mniejsze od 10, aż do f= 9 bo jest mniejsze od 10.
               Gdy ten warunek zostanie sprawdzony i stanie się fałszywy sprawdzany jest warunek z pętli pierwszej*/
        }

    }

}