public class PrzeciążanieMetod {

        int x;
    int y;
     void ustawXY(int wspX, int wspY){
         x = wspX;
         y = wspY;
     }
     void ustawXY(Point point){
         x = point.x;
         y = point.y;

     }

        public static void main(String[] args) {
            Point point = new Point();
            Point secondPoint = new Point();

            point.ustawXY(null);
            secondPoint.ustawXY(null);
    }
}




