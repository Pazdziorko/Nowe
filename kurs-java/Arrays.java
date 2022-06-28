public class Arrays {
    public static void main(String[] args) {
        int numArr[] = new int[10];
        numArr[1] = 7;
        System.out.println("numArr[1]:" + numArr[1]
                + " numArr.length" + numArr.length);

        float floatsArr[] = {12.5f, -76.8f, 98.6f, 32.5f};
        System.out.println("floutsArr[1]" + floatsArr[1]
                + " floutsArr.length " + floatsArr.length);

        String strArr[] = new String[7];
        System.out.println("strArr[1] " + strArr[1]);

        String namesArr[] = {" Ola", "Ania", "Karol"};
        System.out.println("namesArr[1] " + namesArr[1]);
    }
}
