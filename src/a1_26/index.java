package a1_26;

public class index {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.setAge(5);
		dog.setName("̩��");
		System.out.print(dog.getName()+"   "+dog.getAge()+"��");
		dog.sum();
		dog.eat();
		cat.setName("�ӷ�è");
		cat.setAge(3);
		System.out.print(cat.getName()+"   "+cat.getAge()+"��");
		cat.sum();
		cat.eat();
	}

}
