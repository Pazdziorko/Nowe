public class Calculator {



    public static void main(String[] args) {
        Reader reader = new Reader();
        CalculateService calculateService = new CalculateService();
        boolean shouldContinue = true; // utworzenie typu boolean o wartości prawda i nazwie czy powinno kontynuować
        while (shouldContinue) {       // rozpoczęcie pętli, będzie ją powtarzało dopóki shouldContinue nie będzie miało wartości fałsz
            System.out.println("Wykonaj działanie!");

            System.out.println("Podaj pierwszą liczbę!");
            String firstNumber;

            firstNumber = reader.readText();

            System.out.println("Podaj drugą liczbę!");
           String secondNumber;

            secondNumber = reader.readText();



            System.out.println("Dodawanie - wciśnij +");
            System.out.println("Odejmowanie - wciśnij -");
            System.out.println("Mnożenie - wciśnij *");
            System.out.println("Dzielenie - wciśnij /");
             var symbol = reader.readText().charAt(0);
             System.out.println(switch (symbol){
                 case '+' -> calculateService.sum(firstNumber, secondNumber);
                 case '-' -> calculateService.subtraction(firstNumber, secondNumber);
                 case '*' -> calculateService.multiplication(firstNumber, secondNumber);
                 case '/' -> calculateService.division(firstNumber, secondNumber);
                 default  -> "Wybrałeś niepoprawną operację";

             });


            System.out.println("Czy chcesz wykonać następną oprację? (Y/N)");

            String choice = reader.readText();

            if (choice.equals("N")) {
                shouldContinue = false;
            }
        }
    }
}
