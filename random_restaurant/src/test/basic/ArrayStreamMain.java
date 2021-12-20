package test.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStreamMain {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        Arrays.stream(arr)
                .forEach(s -> System.out.println(s));
        System.out.println("====================");

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        int sum2 = integers.stream().mapToInt(n -> n.intValue()).sum();
        System.out.println(sum2);

    }
}
