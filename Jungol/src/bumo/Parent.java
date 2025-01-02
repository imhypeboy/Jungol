package bumo;
public class Parent {
    public String name;  // 이름 저장
    public String ssn;   // 주민등록번호 또는 고유 ID 저장

    // 생성자: name과 ssn을 초기화
    Parent(String name, String ssn) {
        this.name = name; // 인스턴스 변수 name에 매개변수 name을 할당
        this.ssn = ssn;   // 인스턴스 변수 ssn에 매개변수 ssn을 할당
    }
}