package exercise;

public class Monitor {
    private int width = 3840;
    private int height = 1920;


    public void lowResolution(){
        width = 800;
        height = 600;
    }
    public  void heightResolution(){
        width = 3840;
        height = 1920;
    }
    public String getResolution (){
        return "Rozdzielczość = "+ width + "x" + height;
    }
}
