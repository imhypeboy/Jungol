package j3.p49;

public class Cat extends Animal {
	public Cat(){
		this.kindString = "포유류";
		
	}
	@Override 
	public void sound() {
		System.out.println("야");
	}
}