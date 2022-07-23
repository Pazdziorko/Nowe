package exercise.listing7_1;

public class Rectangle extends TwoDShape {

    boolean isSquare() {
        if (width == height) {
        return true;
    } else {
            return false;

        }

    }

    double area(){
        return width * height;
    }
}
