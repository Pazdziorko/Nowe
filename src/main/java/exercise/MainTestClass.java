package exercise;

public class MainTestClass {
    public static void main(String[] args) {
        Point3D point = new Point3D();

        System.out.println("x = " + point.x);
        System.out.println("y = " + point.y);
        System.out.println("z = " + point.z);
        System.out.println("");

        point.setX(100);
        point.setY(200);

        System.out.println("x = " + point.x);
        System.out.println("y = " + point.y);
        System.out.println("z = " + point.z);
        System.out.println("");

        point.setXY(300,400);
        System.out.println("x = " + point.x);
        System.out.println("y = " + point.y);
        System.out.println("z = " + point.z);
        System.out.println("");
    }
}
