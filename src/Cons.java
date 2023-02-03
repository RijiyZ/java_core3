import java.util.function.Consumer;

public class Cons {
    public static void main(String[] args) {
        Consumer<String> consumer1 = x -> System.out.println("Welcome! " + x);
        consumer1.accept("Ivan");
        consumer1.accept("Anastasia");
    }
}
