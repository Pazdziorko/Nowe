package listings.listings7.listing7_3;

public class Triangle extends TwoDShape {
    String style;

    double area(){
        return getWidth() * getHeight() / 2;

    }
    void showStyle(){
        System.out.println("Triangle is: " +style);

    }

}
