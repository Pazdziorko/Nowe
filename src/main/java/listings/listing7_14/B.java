package listings.listing7_14;

public class B extends A{
    int k;
    B(int a, int b, int c){
        super(a, b);
        k = c ;
    }
    void show(){    // ta metoda (o takiej samej nazwie przesłania tą z klasy bazowej A.
        super.show(); // wywołanie przesłoniętej metody z klasy A.
        System.out.println("k = " + k);
    }
}
