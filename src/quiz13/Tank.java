package quiz13;

public class Tank extends Unit {
	
	public boolean modeFlag = false;
	
	public Tank(int x, int y) {
		super(x, y, 200);
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
	
	public void changeMode() {
		modeFlag = modeFlag ? false : true;
	}
	
	
	
	
	
	
	
}
