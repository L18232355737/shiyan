package shiyan;

public class ��ͬ���� {
	public void add() {
		System.out.println("û�в���");
	}
	public void add(int a) {
		System.out.println("����A��ֵ��"+a);
	}
	public void add(int a,int b) {
		
		System.out.println("����A��ֵ��"+a+"   ����B��ֵ��"+b);
	}
	public void add(int a,String b) {
		System.out.println("����A��ֵ��"+a+"   �ַ���B��ֵ��"+b);
	}
	public void add(String b,int a) {
		System.out.println("�ַ���B��ֵ��"+b+"   ����A��ֵ��"+a);
	}
	public void add(float a,float b) {
		System.out.println("������A��ֵ��"+a+"   ����B��ֵ��"+b);
	}
	public void add(float a,String b) {
		System.out.println("������A��ֵ��"+a+"   �ַ���B��ֵ��"+b);
	}
	public void add(String b,float a) {
		System.out.println("�ַ���B��ֵ��"+b+"   ������A��ֵ��"+a);
	}
	public static void main(String[]args) {
		��ͬ���� c=new ��ͬ����();
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
