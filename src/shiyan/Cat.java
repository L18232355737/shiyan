package shiyan;

public class Cat {

	public static void main(String[]args) {
	
		Cat1 c=new Cat1("加菲猫",10);
		System.out.println(c.getName()+"   "+c.getAge()+"岁");
		
		c.method();
		//Cat1 c=new Cat1();
		//c.setName("二傻");
		//c.setAge(6);
		//c.setSex('男');
		//System.out.println(c.getName()+"在跑步");
		//System.out.println(c.getName()+"年龄 为:"+c.getAge()+"    性别:"+c.getSex());
	}
}
