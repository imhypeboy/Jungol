package j3.p690;

public class JetPlane extends Plane implements Flyable, Soundable {


	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("제트기 소리: 슈우웅 ");
		
	}
	
	@Override
	public void fly() {
		System.out.println("제트기가 날라갑니다.");
	}

}
