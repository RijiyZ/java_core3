import java.util.function.Predicate;

public class Pred {
    public static void main(String[] args) {
        Predicate<Integer> predicateAnon = s -> s > 0;
        System.out.println(predicateAnon.test(2));
        System.out.println(predicateAnon.test(-5));
        System.out.println(predicateAnon.test(4));
        System.out.println(predicateAnon.test(-1));
        System.out.println(predicateAnon.test(100));
    }
}
