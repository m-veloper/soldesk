package test.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamMain {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("�丶��");
        strings.add("����");
        strings.add("�������");
        strings.add("��");

        // ���ٽ�
        Stream<String> stream = strings.stream();
        stream.forEach(s -> System.out.println(s));

        // for
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("======����====");
        strings.stream()
                .sorted()
                .forEach(s -> System.out.println(s));
        System.out.println("======��====");
        strings.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
        System.out.println("======�� ����====");
        strings.stream().filter(s -> s.length() >= 5).forEach(n -> System.out.println(n));
    }
}
