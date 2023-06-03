package stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream {

    private static List<String> names = List.of("Pepa", "luky", "Kuba", "Franc");

    public static void main(String[] args) {
        List<Person> people = names.stream()
                .map(name -> new Person(name))
                .toList();
        people.forEach( person-> person.setAge(new Random().nextInt(10,50)));

        List<Person> adults = people.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());

        OptionalDouble average = people.stream()
                .map(Person::getAge)
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("průměrný věk lidí je");
        average.ifPresent(System.out::println);

        Optional<Person> someone = adults.stream()
                .findAny();
//        nějaký cool kombo na operátor
//        jinak by to bylo someone.ifPresent(value -> System.out.println(value);
        someone.ifPresent(System.out::println);
    }
}
