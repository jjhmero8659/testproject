package software;



public class Test {
	public static void main(String[] args) {
		DrinkItem dk = new DrinkItem();
		Customer cus = new Customer();
		Barista bar = new Barista();
		
		
		System.out.println("반갑습니다. cafe 1입니다.");
		Menu mn = cus.order(dk);
		
		System.out.println("수량 :" + cus.dk_num());
		
	}
	
	
}
