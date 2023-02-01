package Predicate;

public class PredicateAnonim {
    public static void main(String[] args) {
        PredicateInteface<Integer> predicateAnon = s -> s > 0;
        System.out.println(predicateAnon.test(2));
        System.out.println(predicateAnon.test(-5));
        System.out.println(predicateAnon.test(4));
        System.out.println(predicateAnon.test(-1));
        System.out.println(predicateAnon.test(100));
    }
}
