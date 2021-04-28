package ClassEx;

public class Dog extends Animal{
	String hobby;
	public Dog(String name,String hobby) {
		super(name);
		this.hobby = hobby;
	}

	//@Override
//	void bark() {
//		System.out.println("¸Û¸Û!");
//	}
	void hbinfo() {
		System.out.println(hobby);
	}
	
}
