package software;



public class Test {
	public static void main(String[] args) {
		DrinkItem dk = new DrinkItem();
		Customer cus = new Customer();
		Barista bar = new Barista();
		
		
		System.out.println("�ݰ����ϴ�. cafe 1�Դϴ�.");
		Menu mn = cus.order(dk);
		
		System.out.println("���� :" + cus.dk_num());
		
	}
	
	
}
