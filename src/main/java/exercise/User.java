package exercise;

public class User {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean canLegalBayAlcohol() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }


}


