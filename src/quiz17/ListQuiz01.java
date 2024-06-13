package quiz17;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {
		/*
		1. 숫자를 저장하는 리스트를 만들고, 1~20까지 값을 순서대로 저장
		2. UserVO를 저장할 수 있는 리스트를 만들고, User객체 3개를 저장
		3. 2번에 저장된 list안에, 이름과 나이를 반복문으로 전부 출력.
		4. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체의 이름과 나이를 출력
		5. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체를 삭제.		
		*/

		//1. 숫자를 저장하는 리스트를 만들고, 1~20까지 값을 순서대로 저장
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 20; i++ ) {
			list.add(i);
		}
		
		//2. UserVO를 저장할 수 있는 리스트를 만들고, User객체 3개를 저장
		List<UserVO> list2 = new ArrayList<>();
		
		list2.add( new UserVO("홍길자", 20) );
		list2.add( new UserVO("이순신", 30) );
		list2.add( new UserVO("홍길동", 40) );
		
		//3. 2번에 저장된 list안에, 이름과 나이를 반복문으로 전부 출력.
		for(int i = 0; i < list2.size(); i++ ) {
			 
			UserVO vo= list2.get(i);
			System.out.println( vo.getName() + ", " + vo.getAge() );
		}
		
		
		System.out.println("-----------------------------------------------");
		//4. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체의 이름과 나이를 출력
		for(int i = 0; i < list2.size(); i++) {
			
			UserVO vo = list2.get(i);
			if(vo.getName().equals("홍길동")  ) {
				System.out.println("홍길동이 있습니다!");
				System.out.println( vo.getName() + ", " + vo.getAge() );
			}
			
		}
		
		System.out.println("-----------------------------------------------");
		
		//5. 2번에 저장된 list안에, "홍길동" 이 있다면, 홍길동 객체를 삭제.		
		
		for(int i = 0; i < list2.size(); i++) {
			
			if(list2.get(i).getName().equals("홍길동") ) {
				list2.remove(i); //i번째 삭제
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
