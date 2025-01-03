package ChildExample;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();

        parent.method1();
        parent.method2();
        // parent.method3(); // 호출 불가능

        child.method1();
        child.method2();
        child.method3();

        System.out.println("----------------------------");

        parent = child;
        parent.method1();
        parent.method2();
    }
}