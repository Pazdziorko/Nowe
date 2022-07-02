package com.exercises;


public class Point {
    int x;
    int y;

    void giveCoordinates() { // metoda nie przyjmująca żadnych parametrów(pusty nawias)
        // i nie zwraca żadnego wyniku.

        System.out.println("pointFirst.x = " + x); // to są tylko instrukcje dla metody void.
        System.out.println("pointFirst.y = " + y);
    }

    int a;
    int b;

    int pullA() {
        return a;

    }

    int pullB() {
        return b;
    }
    void giveCoordinatesFirst (){
        System.out.println("pointFirst.x = " + x);
        System.out.println("pointFirst.y = " + y);
    }
}


