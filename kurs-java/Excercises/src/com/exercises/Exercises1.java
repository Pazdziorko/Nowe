package com.exercises;

public class Exercises1 {
    public static void main(String[] args) {

        Point pointFirst = new Point();
        pointFirst.x = 100;
        pointFirst.y = 100;
        pointFirst.giveCoordinates();
        System.out.println("firstPoint = " + pointFirst.pullA());
        System.out.println("secondPoint = " + pointFirst.pullB());


        Integer integer = new Integer();
        integer.giveNumber();
        integer.pullNumber();

        System.out.println("Zwracana wartość = " + integer.pullNumber());

        Rectangle topLeft = new Rectangle();
        Rectangle lowerLeft = new Rectangle();
        Rectangle topRight = new Rectangle();
        Rectangle lowerRight = new Rectangle();


        System.out.println("Współrzędna prostokąta A= " + topLeft.giveCoordinatesA());
        System.out.println("Współrzędna prostokąta B= " + topLeft.giveCoordinatesB());
        System.out.println("Współrzędna prostokąta C= " + lowerLeft.giveCoordinatesC());
        System.out.println("Współrzędna prostokąta D= " + lowerLeft.giveCoordinatesD());
        System.out.println("Współrzędna prostokąta E= " + topRight.giveCoordinatesE());
        System.out.println("Współrzędna prostokąta F= " + topRight.giveCoordinatesF());
        System.out.println("Współrzędna prostokąta G= " + lowerRight.giveCoordinatesG());
        System.out.println("Współrzędna prostokąta H= " + lowerRight.giveCoordinatesH());
    }
}