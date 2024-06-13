package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		com.computerInfo();
		
		Monitor mo = com.getMonitor();
		mo.info();
		
	}
}
