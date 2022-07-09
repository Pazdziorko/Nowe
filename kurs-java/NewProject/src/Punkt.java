public class Punkt {



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
        void ustawX(Punkt punkt){
            x =punkt.x;
        }
        void ustawY(Punkt punkt){
            y = punkt.y;

        }
        void ustawY (int wspY){
            y = wspY;
        }
        void ustawXY(Punkt punkt){
            x = punkt.x;
            y = punkt.y;
        }
        Punkt pobierzWspółrzędne(){
            Punkt punkt = new Punkt();
            punkt.x = x;
            punkt.y = y;
            return punkt;
        }
        void wyświetlWspółrzędne(){
            System.out.println("Współrzędna x = " + x);
            System.out.println("Współrzędna y = " + y);
        }



    }

