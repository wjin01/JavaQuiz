package quiz20;

public class Data<N,A,E,R> {
	private N name;
	private A age;
	private E em;
	private R rg;
	public Data() {
		// TODO Auto-generated constructor stub
	}
	public void setAll(N name, A age, E em, R rg) {
		
		this.name = name;
		this.age = age;
		this.em = em;
		this.rg = rg;
	}
	
	public N getName() {
		return name;
	}
	public A getAge() {
		return age;
	}
	public E getEm() {
		return em;
	}
	public R getRg() {
		return rg;
	}
	
	
	
	
}
