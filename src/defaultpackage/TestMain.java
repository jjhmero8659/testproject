package defaultpackage;

public class TestMain {
	public static void main(String[] args) {
		int[] A = {10, 4, 5, 8, 1, 8, 3, 6};
		int[] B;
		B = Counting.sort(A, 11);
		for (int i = 0; i < B.length; i++)
		System.out.print(B[i] + " ");
		System.out.println();
	}
}
