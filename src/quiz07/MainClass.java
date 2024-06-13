package quiz07;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("비행기");
		
		ap.takeOff();
		ap.flyMode = 1;
		ap.fly();
		ap.land();
		
	}
}
