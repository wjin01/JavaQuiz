package quiz10;

import java.util.Arrays;

public class MyCart {
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0;
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		this.money = money;
	}
	
	/* 
	 * 3. buy(모든 상품을 받도록 선언)
	 * 접근제어자 퍼블릭
	 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고
	 * add(상품)을 호출해 줍니다.
     */ 	
	
	public void buy(Product p) {
		
		if(this.money < p.price) {
			System.out.println("금액부족");
			return;
		}else {
			this.money -= p.price;
			add(p);
		}
	}
	
	/* 
	 * 4. add(모든 상품을 받도록 선언)
	 * 접근제어자 프라이빗
	 *
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 */
	private void add(Product p) {
		if(i >= cart.length) {
			Product[] newArr = Arrays.copyOf(cart, cart.length * 2);
			cart = Arrays.copyOf(newArr, newArr.length);
			newArr = null;	
		}
		cart[i] = p;
		i++;
	}

	/*
	 * 5.info()
	 * 
	 * instanceof 를 적용해보면 좋을것 같아요
	 * radio instanceof Radio ? true : false
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	public void productInfo() {
		int sum = 0;
		String str = "";
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] instanceof Computer) {
				str += "computer";
				sum += 600;
			} else if (cart[i] instanceof Radio) {
				str += cart[i].name;
				sum += cart[i].price;
			} else if (cart[i] instanceof Tv) {
				str += cart[i].name;
				sum += cart[i].price;
			}
//			System.out.println(cart[i].name);
//			sum += cart[i].price;
		}
		System.out.println("장바구니 총 합: " + sum);
		System.out.println("남은금액: " + money);
	}	
}

