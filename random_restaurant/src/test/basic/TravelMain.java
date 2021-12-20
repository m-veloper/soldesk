package test.basic;

import java.util.ArrayList;
import java.util.List;

public class TravelMain {

    public static void main(String[] args) {
        TravelCustomer customer1 = new TravelCustomer("이순신", 45, 1000);
        TravelCustomer customer2 = new TravelCustomer("김유신", 20, 1500);
        TravelCustomer customer3 = new TravelCustomer("홍길동", 25, 2000);

        List<TravelCustomer> travelCustomers = new ArrayList<>();
        travelCustomers.add(customer1);
        travelCustomers.add(customer2);
        travelCustomers.add(customer3);

        System.out.println("순서대로 출력");
        travelCustomers.stream()
                .map(c -> c.getName())
                .forEach(s -> System.out.println(s));

        System.out.println("총 여행 비용");
        int total = travelCustomers.stream()
                    .mapToInt(c -> c.getPrice()).sum();
        System.out.println(total);

        System.out.println("20세 이상 고객 명단");
        travelCustomers.stream()
                .filter(c -> c.getAge() >= 30)
                .map(s -> s.getName())
                .sorted()
                .forEach(n -> System.out.println(n));

    }
}
