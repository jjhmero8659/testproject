package home1;

import java.util.Iterator;
import java.util.Scanner;

public class Homework01 {
public static void main(String[] args) {
	Car[] car = new Car[4];
	for(int i = 0; i < 4; i ++) {
		car[i] = new Car();
	}
	car[1].wheel = 4;
	car[2].speed = 150;
	car[3].men = 1;
	Car.men = 2;
	
	car[1].info();
	car[2].info();
	car[3].info();
	car[0].info();
}
}
class Car{
	int wheel;
	int speed;
	static int men;
	void info() {
		System.out.println("wheel :"+ wheel);
		System.out.println("speed :"+ speed);
		System.out.println("men :"+ men);
		System.out.println();
	}
	
}