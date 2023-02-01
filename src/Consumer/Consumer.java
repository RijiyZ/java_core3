package Consumer;

public class Consumer {
    public static void main(String[] args) {
        ComsumerInterface<String> consumer = name -> System.out.println("Welcome!");

         consumer.accpet("Ivan");
         consumer.accpet("Nastya");
         consumer.accpet("Max");
         consumer.accpet("Eva");
    }

    ComsumerInterface<String> consumer1 = new ComsumerInterface<String>() {
        @Override
            public void accpet(String s) {
                System.out.println("Hello!");
        }
    };
}
