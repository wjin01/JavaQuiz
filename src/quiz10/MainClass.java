package quiz10;

public class MainClass {

	public static void main(String[] args) {
		

		Product com = new Computer();
		Product radio = new Radio();
		Product tv = new Tv();
		
		MyCart mc = new MyCart(1000);
		mc.buy(tv);
		mc.buy(radio);
//		mc.buy(com);
		
		mc.productInfo();
	}
}
