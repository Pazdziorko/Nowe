package exercise.listing7_11;

public class IncompatibleRef {
    X x = new X(10);
    X x2;
    Y y = new Y(5);

    // x2 = x; // To się skompiluje (odwołanie do tej samej klasy)

    // x2 = y; // To się nie skompiluje (referencja do innej klasy)


}
