package cafe;
public class Menu {
private MenuItem[] arr = new MenuItem[4];

	public Menu() {
		arr[0] = new MenuItem("�Ƹ޸�ī��", 2000);
		arr[1] = new MenuItem("ī���", 2300);
		arr[2] = new MenuItem("ī���ī", 2500);
		arr[3] = new MenuItem("ī��Ḷ���ƶ�", 2600);
	}

	public void showMenus() { // arr���� MenuItem���� �ϳ��� ���°�
		// ä���
		for(int i = 0; i < 4; i++) {
			System.out.printf("%-10s %d\n",arr[i].getName(),arr[i].getPrice());
		}
	}

	public MenuItem choose(int idx) {
		return arr[idx];
	}
}