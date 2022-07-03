public class Main {
    public static void main(String[] args) {

Point point = new Point();
Point secondPoint;
 point.ustawX(100);
 point.ustawY(100);

        System.out.println("Obiekt point ma współrzędne = ");
        point.wyświetlWspółrzędne();
        System.out.print("\n");

        secondPoint =  point.pobierzWspółrzędne();

        System.out.println("Obiekt secondPoint ma współrzędne = ");
        secondPoint.wyświetlWspółrzędne();
        System.out.println("\n");

        Point thirdPoint = new Point();
        thirdPoint.ustawXY(secondPoint);

        System.out.println("Obiekt thirdPoint ma współrzędne = ");
        thirdPoint.wyświetlWspółrzędne();
        System.out.println("\n");



    }
}
