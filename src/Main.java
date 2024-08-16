import demo.person;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 6; i++) {
            person p = new person();
            p.setIds(String.valueOf(i));
        }
    }
}