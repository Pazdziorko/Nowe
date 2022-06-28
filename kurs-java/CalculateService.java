public class CalculateService {
    public float sum(String first, String second) {
        return Float.parseFloat(first) + Float.parseFloat(second);
    }
    public float subtraction(String first, String second) {
        return Float.parseFloat(first) - Float.parseFloat(second);
    }
    public float multiplication(String first, String second) {
        return Float.parseFloat(first) * Float.parseFloat(second);
    }
    public float division(String first, String second) {
        if (Float.parseFloat(second) == 0){
            System.out.println("Nie dzielimy przez zero");
            System.exit(1);
        }
        return Float.parseFloat(first) / Float.parseFloat(second);

    }
}
