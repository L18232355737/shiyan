package shiyan;

public class Cat1 {
	public Cat1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	private String name;
	private char sex;
	private int age;
	private String pingzhong;
	public String getPingzhong() {
		return pingzhong;
	}
	public void setPingzhong(String pingzhong) {
		this.pingzhong = pingzhong;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void method() {
		//CatEat eat=new CatEat();
		
		System.out.println(name+"ÔÚ×ßÃ¨²½");
		//eat.eat(name);
	}
	
}
