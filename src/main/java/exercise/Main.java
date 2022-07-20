package exercise;

public class Main {
    public static void main(String[] args) {
        User paweł = new User(15, "Paweł");
        if (paweł.canLegalBayAlcohol()) {
            System.out.println("Może kupić");

        } else {
            System.out.println("Nie może kupić");
        }

    }
}
