package quiz17;

public interface IUserManagement {
	//클래스가 가져아하는 추상메서드 선언
	public void insert(String name, int age);
	public void printList();
	public boolean search(String name);
	public boolean delete(String name);

}
