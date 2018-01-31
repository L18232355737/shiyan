package a1_26;

public class index {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.setAge(5);
		dog.setName("Ì©µÏ");
		System.out.print(dog.getName()+"   "+dog.getAge()+"Ëê");
		dog.sum();
		dog.eat();
		cat.setName("¼Ó·ÆÃ¨");
		cat.setAge(3);
		System.out.print(cat.getName()+"   "+cat.getAge()+"Ëê");
		cat.sum();
		cat.eat();
	}

}
