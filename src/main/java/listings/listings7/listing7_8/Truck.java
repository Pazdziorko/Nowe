package listings.listings7.listing7_8;

public class Truck extends Vehicle{
private int cargocap;

Truck(int p, int f, double l, int c){
    super(p, f, l);
 cargocap = c;
}

    public int getCargo() {
        return cargocap;
    }
    public void putCargo(int c){
    cargocap = c;

    }
}
