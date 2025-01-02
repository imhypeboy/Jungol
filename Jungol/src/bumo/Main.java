package bumo;

public class Main {
    public static void main(String[] args) {
        Child c = new Child("홍길동", "123456-1234567", 1);

        System.out.println("name : " + c.name);
        System.out.println("ssn : " + c.ssn);
        System.out.println("childNo : " + c.ChildNo);
    }
}