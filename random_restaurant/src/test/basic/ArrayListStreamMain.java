package test.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamMain {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Åä¸¶½º");
        strings.add("Âû½º");
        strings.add("¿¡µå¿öµå");
        strings.add("Àè");

        // ¶÷´Ù½Ä
        Stream<String> stream = strings.stream();
        stream.forEach(s -> System.out.println(s));

        // for
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("======Á¤·Ä====");
        strings.stream()
                .sorted()
                .forEach(s -> System.out.println(s));
        System.out.println("======¸Ê====");
        strings.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
        System.out.println("======¸Ê ÇÊÅÍ====");
        strings.stream().filter(s -> s.length() >= 5).forEach(n -> System.out.println(n));
    }
}
