import java.util.function.Supplier;

public class Sup {
    public static void main(String[] args) {
        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 100);
        System.out.println(supplier1.get());

        Supplier<Integer> supplier2 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };
        System.out.println(supplier2.get());
    }
}