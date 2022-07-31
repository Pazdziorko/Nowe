package listings.listing7_8;

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 25, 4);
        Truck pickup = new Truck(3, 82, 15, 1);

        double liters;
        int dist = 252;

        liters = semi.fuelneeded(dist);
        System.out.println("Semitruck is carrying " + semi.getCargo() + " tons cargocap.");

        System.out.println("To cover the distance " + dist + " kilometers, semitruck needs "
        + liters + " fuel liters.\n");

        liters = pickup.fuelneeded(dist);
        System.out.println("Pickup is carrying " + pickup.getCargo() + " tons cargocap.");

        System.out.println("To cover the distance " + dist + " kilometers, pickup needs "
        + liters + " fuel liters.");

    }
}
