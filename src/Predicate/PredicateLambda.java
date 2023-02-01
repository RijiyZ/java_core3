package Predicate;

public class PredicateLambda {
    public static void main(String[] args) {
        PredicateInteface<Integer> negative = i -> i < 0;
        System.out.println(negative.test(5));
        System.out.println(negative.test(-5));
        System.out.println(negative.test(25));
        System.out.println(negative.test(-25));
        System.out.println(negative.test(50));
    }
}
