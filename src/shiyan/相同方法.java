package shiyan;

public class 相同方法 {
	public void add() {
		System.out.println("没有参数");
	}
	public void add(int a) {
		System.out.println("整型A的值："+a);
	}
	public void add(int a,int b) {
		
		System.out.println("整型A的值："+a+"   整型B的值："+b);
	}
	public void add(int a,String b) {
		System.out.println("整型A的值："+a+"   字符串B的值："+b);
	}
	public void add(String b,int a) {
		System.out.println("字符串B的值："+b+"   整型A的值："+a);
	}
	public void add(float a,float b) {
		System.out.println("单精度A的值："+a+"   整型B的值："+b);
	}
	public void add(float a,String b) {
		System.out.println("单精度A的值："+a+"   字符串B的值："+b);
	}
	public void add(String b,float a) {
		System.out.println("字符串B的值："+b+"   单精度A的值："+a);
	}
	public static void main(String[]args) {
		相同方法 c=new 相同方法();
		c.add();
		c.add(1);
		c.add(12, 123);
		c.add(123, "asdf");
		c.add("asdf", 123);
		c.add(1.2f, 1.3f);
		c.add(1.23f, "asdf");
		c.add("asdf", 123.1f);
		
		
	}
}
