package quiz13;

public class Marine extends Unit {
	
	public static int attack = 6;
	public static int armor = 0;
	
	public Marine(int x, int y) {
		super(x, y, 60);
	}

	@Override
	public void location() {
		System.out.println("현재위치:" + x + ", " + y);
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
