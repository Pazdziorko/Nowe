package listings.listing7_1;

public class Triangle extends TwoDShape {
    String style;

    double area(){  // powierzchnia
        return width * height / 2;
    }
    void ShowStyle(){
        System.out.println("Triangle is: " + style);
    }

}
