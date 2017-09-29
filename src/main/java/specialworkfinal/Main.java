package specialworkfinal;

public class Main {
    public static void main(String[] args) {
        Message m = new Message("Hello");

        Reader reader = new Reader(m);

        System.out.println(m.getMessage());

    }
}
