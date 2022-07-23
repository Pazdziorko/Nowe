package exercise.listing7_7;

public class B extends A {
    int i; // ta  zmienna składowa i przesłania zmienną z klasy A

    B(int a, int b) {    // konstruktor dwuargumentowy
        super.i = a;   // zmienna i z klasy A
        i = b;         // zmienna i z klasy B
    }

    void show() {
        System.out.println("i in the basic class " + super.i);
        System.out.println("i in the derivative class " + i);
    }


}


