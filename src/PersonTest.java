import java.util.ArrayList;
import java.util.List;


public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person("Ivan", 22);
        Person person2 = new Person("Nastya", 20);
        Person person3 = new Person("Max", 22);
        Person person4 = new Person("Eva", 20);
        Person person5 = new Person("Mama", 45);

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("____________________");

    }
}


