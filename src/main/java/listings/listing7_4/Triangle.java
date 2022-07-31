package listings.listing7_4;

public class Triangle extends TwoDShape {
    private String style;

    Triangle(String s, double width, double height){
        style = s;
        setWidth(width);
        setHeight(height);
    }
    double area(){
        return getWidth() *getHeight() / 2;
    }
    public void showStyle(){
        System.out.println("Triangle is: " + style);
    }
}
