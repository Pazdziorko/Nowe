package exercise.two;

public class Pot {
    public void addSalt() {
        System.out.println("Dodaj sól");
        addPfeffer();
        mix();
        boil();
    }

    public void addPfeffer() {
        System.out.println("Dodaj pieprz");
    }

    public void mix() {
        System.out.println("Mieszaj przez 30 minut");
    }

    public void boil() {
        System.out.println("Gotuj na wolnym ogniu pod przykryciem");
    }
}
