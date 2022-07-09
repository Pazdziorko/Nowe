public class PointSecondMain {
    public static void main(String[] args) {
        PointSecond punkt1 = new PointSecond();
        System.out.println("punkt1");
        System.out.println("x = " + punkt1.x);
        System.out.println("y = " + punkt1.y);
        System.out.println("");

        PointSecond punkt2 = new PointSecond(100,100);
        System.out.println("punkt2");
        System.out.println("x = " + punkt2.x);
        System.out.println("y = " + punkt2.y);
        System.out.println("");

        PointSecond punkt3 = new PointSecond(punkt1);
        System.out.println("punkt3");
        System.out.println("x = " + punkt3.x);
        System.out.println("y = " + punkt3.y);


    }
}
