package stream;

import java.util.List;
import java.util.Optional;

public class OptionalLambda {

    private static List<String> names = List.of("Pepa", "luky", "Kuba", "Franc");

    public static void main(String[] args) {

        Optional<String> startWithP = Optional.empty();

        for (String name : names
        ) {
            if (name != null && name.toLowerCase().startsWith("p")) {
                startWithP = Optional.of(name);
                break;
            }
        }

        if (startWithP.isPresent()) {
            String realName = startWithP.get();
            System.out.println(realName);
        } else {
            System.out.println("Nic tam není");
        }

        startWithP.ifPresentOrElse(n -> System.out.println(n), () -> System.out.println("Nic tam není"));
    }
}
