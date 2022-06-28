public class MultipleArrays {
    public static void main(String[] args) {
        String strArr[][] = { // tablica dwóch wierszy i trzech kolumn
                {"1", "2", "3"},
                {"4", "5", "6"},

        };
        System.out.println(strArr [0][2]);
        System.out.println(strArr[1][2] + strArr[0][0]);

        int numArr [][] = new int[3][4];
        numArr [2][0] = 100;
        System.out.println(numArr[2][0]);
    }
}
