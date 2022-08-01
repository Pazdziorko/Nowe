package listings.listings7.listing7_5;

public class Triangle extends TwoDShape {
    private String style;

    Triangle(String s, double w, double h) {
        super(w, h);
        style = s;
    }

           double area(){
           return getWidth() * getHeight() / 2;
        }

        public void showStyle(){
            System.out.println("Triangle is " + style);
        }

    }


