package shiyan;

public class Cat {

	public static void main(String[]args) {
	
		Cat1 c=new Cat1("�ӷ�è",10);
		System.out.println(c.getName()+"   "+c.getAge()+"��");
		
		c.method();
		//Cat1 c=new Cat1();
		//c.setName("��ɵ");
		//c.setAge(6);
		//c.setSex('��');
		//System.out.println(c.getName()+"���ܲ�");
		//System.out.println(c.getName()+"���� Ϊ:"+c.getAge()+"    �Ա�:"+c.getSex());
	}
}
