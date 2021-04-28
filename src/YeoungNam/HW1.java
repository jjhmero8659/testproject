package YeoungNam; // ����� ��������

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Random;
	import java.util.Scanner;

	public class HW1 {
		
		public static void main(String[] args) {
			Tree23<String, Integer> st = new Tree23<>();//Ű�� string
			Scanner sc = new Scanner(System.in);	
			System.out.print("�Է� ���� �̸�? ");
			String fname = sc.nextLine();	// ���� �̸��� �Է�
			System.out.print("���� ������ ���� seed ��? ");
			Random rand = new Random(sc.nextLong());
			sc.close();
			try {
				sc = new Scanner(new File(fname));
				long start = System.currentTimeMillis();
				while (sc.hasNext()) {
					String word = sc.next();
					if (!st.contains(word))
						st.put(word, 1);
					else	st.put(word, st.get(word) + 1);
				}
				long end = System.currentTimeMillis();
				System.out.println("�Է� �Ϸ�: �ҿ� �ð� = " + (end-start) + "ms");
				
				System.out.println("### ���� ������ Ʈ�� ����");
				print_tree(st);		// ���������� ��µǸ� 50��
				
				ArrayList<String> keyList = (ArrayList<String>) st.keys();
				Collections.shuffle(keyList, rand);
				int loopCount = (int)(keyList.size() * 0.95);
				for (int i = 0; i < loopCount; i++) {
//					st.delete(keyList.get(i));						// �ּ� ó�� ����
				}
//				System.out.println("\n### Ű ���� �� Ʈ�� ����");			// �ּ� ó�� ����
//				print_tree(st);										// �ּ� ó�� ����. ������� ���������� ��µǸ� 100��
			} catch (FileNotFoundException e) { e.printStackTrace(); }
			if (sc != null)
				sc.close();
		}
		
		private static void print_tree(Tree23<String, Integer> st) {
			System.out.println("��ϵ� �ܾ� �� = " + st.size());		
			System.out.println("Ʈ���� ���� = " + st.depth());		
			
			String maxKey = "";
			int maxValue = 0;
			for (String word : st.keys())
				if (st.get(word) > maxValue) {
					maxValue = st.get(word);
					maxKey = word;
				}
			System.out.println("���� ����� ��Ÿ�� �ܾ�� �󵵼�: " + maxKey + " " + maxValue);
		}
	}

	// ���⼭ ���� Tree23 Ŭ������ �����ϴ� ���α׷� �߰��� ��!
class Tree23<K extends Comparable<K>, V> {

		public int get(String word) {
			
			return 0;
		}

		public void delete(String string) {
			
		}

		public ArrayList<String> keys() {

			return null;
		}

		public void put(String word, int i) {

			
		}

		public boolean contains(String word) {
			if(word.contains(word)) {
				return true;
			}
			else {
				return false;
			}
			
		}

		public String depth() {

			return null;
		}

		public String size() {

			return null;
		}
	 
}

