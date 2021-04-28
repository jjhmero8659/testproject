package defaultpackage;

public class Counting {
	public static int[] sort(int[] A, int K) {
		int i, N = A.length;
		int[] C = new int[K], B = new int[N];
		for (i = 0; i < N; i++) C[A[i]]++; // 원소의 빈도수를 합산
		for (i = 1; i < K; i++) C[i] += C[i-1]; // i 값이 저장될 위치를 계산
		for (i = N-1; i >= 0; i--) // 왜 뒤에서부터 저장할까?
			B[--C[A[i]]] = A[i]; // 정렬된 배열을 생성
		return B;

	}
}
