package defaultpackage;

public class MergeTD extends AbstractSort {
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
		// a[lo .. mid] and a[mid+1 .. hi] 는 이미 정렬
		for (int k = lo; k <= hi; k++)
		aux[k] = a[k]; // aux[] 배열에 a[]의 내용을 일단 복사
		// aux[] 배열을 비교하여 병합된 결과를 a[] 배열에 다시 저장
		int i = lo, j = mid+1;
		for (int k = lo; k <= hi; k++) {
		if (i > mid) a[k] = aux[j++];
		else if (j > hi) a[k] = aux[i++];
		else if (less(aux[j], aux[i])) a[k] = aux[j++];
		else a[k] = aux[i++];
		}
		}
public static void sort(Comparable[] a, Comparable[] aux2, int i, int j) {
Comparable[] aux = new Comparable[a.length];
sort(a, aux, 0, a.length-1);
}
