package exercise.listing7_16;

public class DynDispDemo {
    public static void main(String[] args) {
        Sub superObject = new Sub();
        Sup1 subOb1 = new Sup1();
        Sup2 subOb2 = new Sup2();

        Sub supRef;

        supRef = superObject;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();
    }
}
