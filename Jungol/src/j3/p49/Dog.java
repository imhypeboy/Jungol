package j3.p49;

public class Dog extends Animal {
	public Dog(){
		this.kindString = "포유류";

	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}