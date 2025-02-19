package j618;

import java.util.*;

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() { // 💡 getWeight() 추가
        return this.weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            people.add(new Person(name, height, weight));
        }
        sc.close();

        // 이름순 정렬 (오름차순)
        people.sort(Comparator.comparing(p -> p.name));

        System.out.println("\nname");
        for (Person p : people) {
            System.out.printf("%s %d %.1f%n", p.name, p.height, p.weight);
        }

        // 몸무게순 정렬 (내림차순)
        people.sort(Comparator.comparingDouble(Person::getWeight).reversed());

        System.out.println("\nweight");
        for (Person p : people) {
            System.out.printf("%s %d %.1f%n", p.name, p.height, p.weight);
        }
    }
}
