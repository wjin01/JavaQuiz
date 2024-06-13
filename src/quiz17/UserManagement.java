package quiz17;

import java.util.ArrayList;
import java.util.List;

public class UserManagement implements IUserManagement {

	//값을 저장할 리스트 
	private List<UserVO> list = new ArrayList<>();
	
	//회원정보 추가
	public void insert(String name, int age) {
		UserVO vo = new UserVO(name, age);
		list.add(vo);
	}
	
	//회원정보 출력
	public void printList() {
		System.out.println("==========회원정보 출력=========");
		for(int i = 0; i < list.size(); i++) {
			UserVO vo = list.get(i);
			System.out.println("이름:" + vo.getName() + ", 나이:" + vo.getAge() );
		}
	}
	
	//회원정보 검색
	public boolean search(String name) {
		
		boolean flag = false; 
		for(int i = 0; i < list.size(); i++) {
			
			UserVO vo = list.get(i);
			String n = vo.getName();
			
			if(name.equals(n) ) { //입력받은 회원 이름을 찾음
				System.out.println("번호:" + i + ", 이름:" + vo.getName() + ", 나이:" + vo.getAge() );
				flag = true; //이프문을 실행했음.
			}
		}
		
		return flag;
	}
	
	//회원정보 삭제
	public boolean delete(String name) {
		
		boolean flag = false; 
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getName().equals(name)   ) { //삭제할 이름을 찾음
				list.remove(i);
				System.out.println(name + "님의 회원 정보를 삭제했습니다.");
				flag = true;
				break; //그만
			}
		}
		
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
