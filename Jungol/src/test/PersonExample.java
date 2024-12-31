package test;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "KyeBaek");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        // p1.nation = "USA"; // The final field cannot be assigned.
        // p1.ssn = "654321-7654321"; // The final field cannot be assigned.
        p1.name = "LeeSoonSin";
    }
}