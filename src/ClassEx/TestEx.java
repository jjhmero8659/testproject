package ClassEx;

public class TestEx {
public static void main(String[] args) {
	Animal ani = new Animal("����");
	ani.cry();
	System.out.println(ani.name);
	System.out.println("=============================");
	Dog dog = new Dog("������","����");
	//dog.bark();
	dog.cry();
	dog.hbinfo();
	System.out.println(dog.name);
}
}
