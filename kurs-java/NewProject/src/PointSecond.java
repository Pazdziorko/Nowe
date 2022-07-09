public class PointSecond {
    int x;
    int y;

    PointSecond() {
         x = 1;
         y = 1;
    }
    PointSecond(int x, int y){
        this.x = x;
        this.y = y;
    }
    PointSecond(PointSecond second){
        x = second.x;
        y = second.y;
    }
    public static void main(String[] args) {
    PointSecond second = new PointSecond();
        System.out.println("Punkt X = " + second.x);
        System.out.println("Punkt Y = " + second.y);
    }

}


