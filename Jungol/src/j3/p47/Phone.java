package j3.p47;
public abstract class Phone{
	public String ownerString;
	
	public Phone(String owner) { 
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
		
	}
	
	public void turnOff() {
		System.out.println(" 폰 전원을끕니다.");
	}
}