package ClassEx;

public class TestEx {
public static void main(String[] args) {
	Animal ani = new Animal("동물");
	ani.cry();
	System.out.println(ani.name);
	System.out.println("=============================");
	Dog dog = new Dog("강아지","게임");
	//dog.bark();
	dog.cry();
	dog.hbinfo();
	System.out.println(dog.name);
}
}
