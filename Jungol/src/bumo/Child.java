package bumo;

public class Child extends Parent {
    public int ChildNo;

    Child(String name, String ssn, int childNo) {
        super(name, ssn);
        this.ChildNo = childNo;
    }
}