package baseball;

public class Main {
	public static void main(String[] args) {
		int LEN = 3;
		Myball my_ball = new Myball(LEN);
		Baseball base_ball = new Baseball(LEN);
		Check check = new Check();
		base_ball.com_randoms();
		
		for(int i= 0; i<LEN; i++) {
			System.out.println(base_ball.get_random(i));
		}
		do {
			my_ball.scan_randoms();
		}while(check.check(base_ball, my_ball));
		System.out.printf("s:%d b:%d o:%d\n",check.strike(),check.ball(),
				check.out(base_ball));
		System.out.printf("½ÇÇàÈ½¼ö´Â %d",check.count());
	}
	
}
