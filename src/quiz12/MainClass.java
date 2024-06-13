package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
		Shape c = new Circle("원형",4);
		Shape r = new Rect("사각형",4);
		
		System.out.println(c.getArea() + " " + r.getArea());
	}

}
