package listings.listing7_8;

public class Vehicle {
    private int passengers;
    private int fuelcap;
    private double lkm;

    Vehicle(int p, int f, double l){
        passengers = p;
        fuelcap = f;
        lkm = l;
    }
    int range(){
        return (int) (fuelcap / lkm * 100);
    }
    double fuelneeded(int km){
        return (double) km / 100 * lkm;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int p) {
        this.passengers = p;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int f) {
        this.fuelcap = f;
    }

    public double getLkm() {
        return lkm;
    }

    public void setMpg(double l) {
        this.lkm = l;
    }
}
