package test.basic;

import java.util.ArrayList;
import java.util.List;

public class TravelMain {

    public static void main(String[] args) {
        TravelCustomer customer1 = new TravelCustomer("�̼���", 45, 1000);
        TravelCustomer customer2 = new TravelCustomer("������", 20, 1500);
        TravelCustomer customer3 = new TravelCustomer("ȫ�浿", 25, 2000);

        List<TravelCustomer> travelCustomers = new ArrayList<>();
        travelCustomers.add(customer1);
        travelCustomers.add(customer2);
        travelCustomers.add(customer3);

        System.out.println("������� ���");
        travelCustomers.stream()
                .map(c -> c.getName())
                .forEach(s -> System.out.println(s));

        System.out.println("�� ���� ���");
        int total = travelCustomers.stream()
                    .mapToInt(c -> c.getPrice()).sum();
        System.out.println(total);

        System.out.println("20�� �̻� �� ���");
        travelCustomers.stream()
                .filter(c -> c.getAge() >= 30)
                .map(s -> s.getName())
                .sorted()
                .forEach(n -> System.out.println(n));

    }
}
