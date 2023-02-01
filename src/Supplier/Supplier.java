package Supplier;

import static java.lang.Math.random;

public class Supplier {
    public static void main(String[] args) {
        SupplierInterface<Integer> supplier1 = () -> (int) Math.random() * 100;
        System.out.println(supplier1.get());

        SupplierInterface<Integer> supplier2 = new SupplierInterface<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };
        System.out.println(supplier2.get());
    }
}