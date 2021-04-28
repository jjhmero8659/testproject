package baseball;

public class Check {
	private int strike;
	private int ball;
	private int cnt = 0;
	
	boolean check(Baseball baseball, Myball myball) {
		strike = 0;
		ball = 0;
		for(int i=0; i < baseball.arrlength(); i++) {
			for(int j=0; j < baseball.arrlength(); j++) {
				if(baseball.get_random(i) == myball.get_scrandom(j)) {
					if(baseball.get_random(i) == myball.get_scrandom(i)) {
						strike++;
					}
					else {
						ball++;
					}
				}
			}
		}
		cnt++;
		if(strike == 3) {
			return false;
		}
		System.out.printf("s:%d b:%d o:%d\n",strike,ball,baseball.arrlength()-strike-ball);
		return true;
	}
	int strike() {
		return strike;
	}
	int ball() {
		return ball;
	}
	int out(Baseball baseball) {
		return baseball.arrlength()-strike-ball;
	}
	int count() {
		return this.cnt;
	}
}
