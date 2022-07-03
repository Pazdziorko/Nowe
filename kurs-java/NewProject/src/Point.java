public class Point {


    int x;
    int y;

    int pobierzX(){
        return x;
    }
    int pobierzY(){
        return y;
    }
    void ustawX(int wspX){
        x = wspX;
    }
    void ustawY (int wspY){
        y = wspY;
    }
    void ustawXY(Point point){
        x = point.x;
        y = point.y;
    }
    Point pobierzWspółrzędne(){
        Point point = new Point();
        point.x = x;
        point.y = y;
        return point;
    }
    void wyświetlWspółrzędne(){
        System.out.println("Współrzędna x = " + x);
        System.out.println("Współrzędna y = " + y);
    }



    }

