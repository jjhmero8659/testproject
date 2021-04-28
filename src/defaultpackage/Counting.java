package defaultpackage;

public class Counting {
	public static int[] sort(int[] A, int K) {
		int i, N = A.length;
		int[] C = new int[K], B = new int[N];
		for (i = 0; i < N; i++) C[A[i]]++; // ������ �󵵼��� �ջ�
		for (i = 1; i < K; i++) C[i] += C[i-1]; // i ���� ����� ��ġ�� ���
		for (i = N-1; i >= 0; i--) // �� �ڿ������� �����ұ�?
			B[--C[A[i]]] = A[i]; // ���ĵ� �迭�� ����
		return B;

	}
}
