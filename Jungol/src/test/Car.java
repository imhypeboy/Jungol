package test;

public class Car {
    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;

    // 기본 생성자
    Car() {
    }

    // 모델 이름을 받는 생성자
    Car(String model) {
        this.model = model;
    }

    // 모델과 색상을 받는 생성자
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 모델, 색상, 최대 속도를 받는 생성자
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) { 
        // 기본 생성자 사용
        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        // 모델만 설정하는 생성자 사용
        Car car2 = new Car("Sonata");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        Car car3 = new Car("Sonata", "Red");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Car car4 = new Car("Sonata", "Red", 190);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
        System.out.println();
    }
}