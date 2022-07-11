package exercise;

class Point {
    int x;
    int y;

    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point point) {
        x = point.x;
        y = point.y;
    }

    int pullX() {
        return x;
    }

    int pullY() {
        return y;

    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void setXY(int x, int y) {
       this.x = x;
       this.y = y;
    }

    void projectCoordinate() {
        System.out.println("Coordinate X = " + x);
        System.out.println("Coordinate Y = " + y);
    }

}


class Point3D extends Point {
    int z;


}
