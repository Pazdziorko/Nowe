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

     void setX(int cooX) {
         x = cooX;
     }

     void setY(int cooY) {
         y = cooY;
     }

     void setXY(int cooX, int cooY) {
         x = cooX;
         y = cooY;
     }

     void projectCoordinate() {
         System.out.println("Coordinate X = " + x);
         System.out.println("Coordinate Y = " + y);
     }

 }


     class Point3D extends Point {
         int z;


     }
